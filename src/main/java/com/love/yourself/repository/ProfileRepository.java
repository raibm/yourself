package com.love.yourself.repository;

import com.love.yourself.entity.Profile;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, ObjectId> {

    Optional<Profile> findBy_id(String _id);
}
