package com.nova.project.shared.infrastructure.sources

sealed class Database<D> : Source<D>() {
    sealed class NoSql<N> : Database<N>() {
        class Mongo<M> : NoSql<M>()
        class Cassandra<C> : NoSql<C>()
    }
    sealed class Sql<S> : Database<S>() {
        class MySql<M> : Sql<M>()
        class PostGreSql<P> : Sql<P>()
        class SqlServer<S> : Sql<S>()
    }
}