/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, boolean-literals
 * PARAGRAPH: 1
 * SENTENCE: [2] These are strong keywords which cannot be used as identifiers unless escaped.
 * NUMBER: 2
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the labelReference.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun `true`() {
    val l = `false`@ {
        return@`false`
    }
    l()
    return@`true`
}

fun box(): String? {
    `true`()

    var i = 0
    `false`@ while (i < 10) {
        i++
        if (i <= 7) {
            continue@`false`
        }
        if (i > 5) {
            break@`false`
        }
    }

    return "OK"
}
