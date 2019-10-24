package com.github.kisaragieffective.kisaragistd.annotations

/**
 * このアノテーションは、信頼できない外部境界から取得した結果について、変数に格納すると同時につけられるべきである。
 * そうすることで、脆弱性やセキュリティホールがもしあったとしても修正が容易になる。
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.EXPRESSION)
annotation class FromExternalSource