package com.github.kisaragieffective.kisaragistd.annotations

@Target(AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
/**
 * They can slow down the JVM.
 */
annotation class UsedStarSpreader