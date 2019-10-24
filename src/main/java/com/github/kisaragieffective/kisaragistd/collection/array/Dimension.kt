package com.github.kisaragieffective.kisaragistd.collection.array

/* InternalError
fun <E> Array<E>.dimensions() = 1
fun <E> Array<E>.dimension() = 1
fun <E> Array<E>.dim() = 1

fun BooleanArray.dimensions() = 1
fun BooleanArray.dimension() = 1
fun BooleanArray.dim() = 1

fun ByteArray.dimensions() = 1
fun ByteArray.dimension() = 1
fun ByteArray.dim() = 1

fun ShortArray.dimensions() = 1
fun ShortArray.dimension() = 1
fun ShortArray.dim() = 1

fun IntArray.dimensions() = 1
fun IntArray.dimension() = 1
fun IntArray.dim() = 1

fun LongArray.dimensions() = 1
fun LongArray.dimension() = 1
fun LongArray.dim() = 1

fun FloatArray.dimensions() = 1
fun FloatArray.dimension() = 1
fun FloatArray.dim() = 1

fun DoubleArray.dimensions() = 1
fun DoubleArray.dimension() = 1
fun DoubleArray.dim() = 1



fun <E> Array<Array<E>>.dimensions() = 2
fun <E> Array<Array<E>>.dimension() = 2
fun <E> Array<Array<E>>.dim() = 2

fun Array<BooleanArray>.dimensions() = 2
fun Array<BooleanArray>.dimension() = 2
fun Array<BooleanArray>.dim() = 2

fun Array<ByteArray>.dimensions() = 2
fun Array<ByteArray>.dimension() = 2
fun Array<ByteArray>.dim() = 2

fun Array<ShortArray>.dimensions() = 2
fun Array<ShortArray>.dimension() = 2
fun Array<ShortArray>.dim() = 2

fun Array<IntArray>.dimensions() = 2
fun Array<IntArray>.dimension() = 2
fun Array<IntArray>.dim() = 2

fun Array<LongArray>.dimensions() = 2
fun Array<LongArray>.dimension() = 2
fun Array<LongArray>.dim() = 2

fun Array<FloatArray>.dimensions() = 2
fun Array<FloatArray>.dimension() = 2
fun Array<FloatArray>.dim() = 2

fun Array<DoubleArray>.dimensions() = 2
fun Array<DoubleArray>.dimension() = 2
fun Array<DoubleArray>.dim() = 2



fun <E> Array<Array<Array<E>>>.dimensions() = 3
fun <E> Array<Array<Array<E>>>.dimension() = 3
fun <E> Array<Array<Array<E>>>.dim() = 3

fun Array<Array<BooleanArray>>.dimensions() = 3
fun Array<Array<BooleanArray>>.dimension() = 3
fun Array<Array<BooleanArray>>.dim() = 3

fun Array<Array<ByteArray>>.dimensions() = 3
fun Array<Array<ByteArray>>.dimension() = 3
fun Array<Array<ByteArray>>.dim() = 3

fun Array<Array<ShortArray>>.dimensions() = 3
fun Array<Array<ShortArray>>.dimension() = 3
fun Array<Array<ShortArray>>.dim() = 3

fun Array<Array<IntArray>>.dimensions() = 3
fun Array<Array<IntArray>>.dimension() = 3
fun Array<Array<IntArray>>.dim() = 3

fun Array<Array<LongArray>>.dimensions() = 3
fun Array<Array<LongArray>>.dimension() = 3
fun Array<Array<LongArray>>.dim() = 3

fun Array<Array<FloatArray>>.dimensions() = 3
fun Array<Array<FloatArray>>.dimension() = 3
fun Array<Array<FloatArray>>.dim() = 3

fun Array<Array<DoubleArray>>.dimensions() = 3
fun Array<Array<DoubleArray>>.dimension() = 3
fun Array<Array<DoubleArray>>.dim() = 3



fun <E> Array<Array<Array<Array<E>>>>.dimensions() = 4
fun <E> Array<Array<Array<Array<E>>>>.dimension() = 4
fun <E> Array<Array<Array<Array<E>>>>.dim() = 4

fun Array<Array<Array<BooleanArray>>>.dimensions() = 4
fun Array<Array<Array<BooleanArray>>>.dimension() = 4
fun Array<Array<Array<BooleanArray>>>.dim() = 4

fun Array<Array<Array<ByteArray>>>.dimensions() = 4
fun Array<Array<Array<ByteArray>>>.dimension() = 4
fun Array<Array<Array<ByteArray>>>.dim() = 4

fun Array<Array<Array<ShortArray>>>.dimensions() = 4
fun Array<Array<Array<ShortArray>>>.dimension() = 4
fun Array<Array<Array<ShortArray>>>.dim() = 4

fun Array<Array<Array<IntArray>>>.dimensions() = 4
fun Array<Array<Array<IntArray>>>.dimension() = 4
fun Array<Array<Array<IntArray>>>.dim() = 4

fun Array<Array<Array<LongArray>>>.dimensions() = 4
fun Array<Array<Array<LongArray>>>.dimension() = 4
fun Array<Array<Array<LongArray>>>.dim() = 4

fun Array<Array<Array<FloatArray>>>.dimensions() = 4
fun Array<Array<Array<FloatArray>>>.dimension() = 4
fun Array<Array<Array<FloatArray>>>.dim() = 4

fun Array<Array<Array<DoubleArray>>>.dimensions() = 4
fun Array<Array<Array<DoubleArray>>>.dimension() = 4
fun Array<Array<Array<DoubleArray>>>.dim() = 4



fun <E> Array<Array<Array<Array<Array<E>>>>>.dimensions() = 5
fun <E> Array<Array<Array<Array<Array<E>>>>>.dimension() = 5
fun <E> Array<Array<Array<Array<Array<E>>>>>.dim() = 5

fun Array<Array<Array<Array<BooleanArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<BooleanArray>>>>.dimension() = 5
fun Array<Array<Array<Array<BooleanArray>>>>.dim() = 5

fun Array<Array<Array<Array<ByteArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<ByteArray>>>>.dimension() = 5
fun Array<Array<Array<Array<ByteArray>>>>.dim() = 5

fun Array<Array<Array<Array<ShortArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<ShortArray>>>>.dimension() = 5
fun Array<Array<Array<Array<ShortArray>>>>.dim() = 5

fun Array<Array<Array<Array<IntArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<IntArray>>>>.dimension() = 5
fun Array<Array<Array<Array<IntArray>>>>.dim() = 5

fun Array<Array<Array<Array<LongArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<LongArray>>>>.dimension() = 5
fun Array<Array<Array<Array<LongArray>>>>.dim() = 5

fun Array<Array<Array<Array<FloatArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<FloatArray>>>>.dimension() = 5
fun Array<Array<Array<Array<FloatArray>>>>.dim() = 5

fun Array<Array<Array<Array<DoubleArray>>>>.dimensions() = 5
fun Array<Array<Array<Array<DoubleArray>>>>.dimension() = 5
fun Array<Array<Array<Array<DoubleArray>>>>.dim() = 5



fun <E> Array<Array<Array<Array<Array<Array<E>>>>>>.dimensions() = 6
fun <E> Array<Array<Array<Array<Array<Array<E>>>>>>.dimension() = 6
fun <E> Array<Array<Array<Array<Array<Array<E>>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<BooleanArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<BooleanArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<BooleanArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<ByteArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<ByteArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<ByteArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<ShortArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<ShortArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<ShortArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<IntArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<IntArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<IntArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<LongArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<LongArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<LongArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<FloatArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<FloatArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<FloatArray>>>>>.dim() = 6

fun Array<Array<Array<Array<Array<DoubleArray>>>>>.dimensions() = 6
fun Array<Array<Array<Array<Array<DoubleArray>>>>>.dimension() = 6
fun Array<Array<Array<Array<Array<DoubleArray>>>>>.dim() = 6



fun <E> Array<Array<Array<Array<Array<Array<Array<E>>>>>>>.dimensions() = 7
fun <E> Array<Array<Array<Array<Array<Array<Array<E>>>>>>>.dimension() = 7
fun <E> Array<Array<Array<Array<Array<Array<Array<E>>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<ByteArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<ByteArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<ByteArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<ShortArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<ShortArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<ShortArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<IntArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<IntArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<IntArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<LongArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<LongArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<LongArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<FloatArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<FloatArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<FloatArray>>>>>>.dim() = 7

fun Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>.dimensions() = 7
fun Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>.dimension() = 7
fun Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>.dim() = 7



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>.dimensions() = 8
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>.dimension() = 8
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>.dim() = 8

fun Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>.dimensions() = 8
fun Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>.dimension() = 8
fun Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>.dim() = 8



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>.dimensions() = 9
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>.dimension() = 9
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>.dim() = 9

fun Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>.dimensions() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>.dimension() = 9
fun Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>.dim() = 9



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>.dimensions() = 10
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>.dimension() = 10
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>.dim() = 10

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>.dimensions() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>.dimension() = 10
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>.dim() = 10



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>.dimensions() = 11
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>.dimension() = 11
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>.dim() = 11

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>.dimensions() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>.dimension() = 11
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>.dim() = 11



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>.dimensions() = 12
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>.dimension() = 12
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>.dim() = 12

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>.dimensions() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>.dimension() = 12
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>.dim() = 12



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>.dimensions() = 13
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>.dimension() = 13
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>.dim() = 13

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>.dimensions() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>.dimension() = 13
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>.dim() = 13



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>.dimensions() = 14
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>.dimension() = 14
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>.dim() = 14

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>.dimensions() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>.dimension() = 14
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>.dim() = 14



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>.dimensions() = 15
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>.dimension() = 15
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>.dim() = 15

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>.dimensions() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>.dimension() = 15
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>.dim() = 15



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>.dimensions() = 16
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>.dimension() = 16
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>.dim() = 16

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>.dimensions() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>.dimension() = 16
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>.dim() = 16



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>.dimensions() = 17
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>.dimension() = 17
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>.dim() = 17

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>.dimensions() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>.dimension() = 17
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>.dim() = 17



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>.dimensions() = 18
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>.dimension() = 18
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>.dim() = 18

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>.dimensions() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>.dimension() = 18
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>.dim() = 18



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>.dimension() = 19
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>.dim() = 19

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>.dimensions() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>.dimension() = 19
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>.dim() = 19



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>.dim() = 20

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>.dimensions() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>.dimension() = 20
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>.dim() = 20



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>.dim() = 21

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>.dimensions() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>.dimension() = 21
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>.dim() = 21



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>.dimensions() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>.dimension() = 22
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>.dim() = 22



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>.dimension() = 23
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>.dim() = 23



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 24
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>.dim() = 24



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 25
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 25



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 26
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 26



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 27
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 27



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 28
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 28



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 29
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 29



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 30
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 30



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 31
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 31



fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun <E> Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<E>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<BooleanArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ByteArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<ShortArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<IntArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<LongArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<FloatArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimensions() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dimension() = 32
fun Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<Array<DoubleArray>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.dim() = 32

*/
