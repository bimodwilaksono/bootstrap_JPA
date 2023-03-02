package com.enigma.repository;

import jakarta.persistence.EntityManager;
import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.StyledText;

import java.sql.Connection;
import java.util.function.Consumer;

public class Repo {
    EntityManager entityManager;

    public Repo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected void inTransaction(Consumer<EntityManager> consumer) {
        try {
            entityManager.getTransaction().begin();
            consumer.accept(entityManager);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            entityManager.getTransaction().rollback();
        }
    }
}
