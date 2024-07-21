package net.khoudmi.tp_cassandra_bdcc.repositories;

import net.khoudmi.tp_cassandra_bdcc.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends
        CassandraRepository<User, UUID> {

}
