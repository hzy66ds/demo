//package com.ivan.demo.main.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//
//
//@Service
//public class MongoDbService {
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    public User getUserById(String id) {
//        Query query = new Query(Criteria.where("_id").is(id));
//        User user = mongoTemplate.findOne(query, User.class);
//        return user;
//    }
//
//    public List<User> getUserBySex(String sex) {
//        Query query = new Query(Criteria.where("sex").is(sex));
//        return mongoTemplate.find(query, User.class);
//    }
//
//    public List<User> exists(String field) {
//        Query query = new Query(Criteria.where(field).exists(true));
//        return mongoTemplate.find(query, User.class);
//    }
//
//    public List<User> findByFields(String sex1, String sex2) {
//        Query query = new Query();
//        if (!StringUtils.isEmpty(sex1)) {
//            query.addCriteria(Criteria.where("sex").is(sex1));
//        }
//        if (!StringUtils.isEmpty(sex2)) {
//            query.addCriteria(Criteria.where("sex2").is(sex2));
//        }
//        return mongoTemplate.find(query, User.class);
//    }
//
//    public User insert() {
//        User user = new User();
//        List<String> sex = new ArrayList<>();
//        sex.add("male");
//        sex.add("female");
//        sex.add("shit");
//        user.setSex(sex);
//        user.setName("xixi");
//        user.setCreateTime(new Date());
////        user.setId("2c4d91132ac543bb9aec471920820878");
//        UserLabel userLabel = new UserLabel();
//        userLabel.setPassport("56.com");
//        userLabel.setCreateTime(new Date());
//        return user;
//    }
//}
