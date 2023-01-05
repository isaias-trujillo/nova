package com.nova.project.shared.infrastructure.sources

sealed class Api<A> : Source<A>() {
    class Public<O> : Api<O>()
    class Internal<O> : Api<O>()
    class Partner<O> : Api<O>()
    class Composite<O> : Api<O>()
}