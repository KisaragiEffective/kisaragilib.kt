package com.github.kisaragieffective.kisaragistd.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
/**
 * It can be applied to interfaces that do not have any methods. [java.lang.Cloneable] is an example.
 */
annotation class MarkerAnnotation
