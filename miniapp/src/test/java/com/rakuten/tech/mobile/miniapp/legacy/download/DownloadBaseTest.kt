package com.rakuten.tech.mobile.miniapp.legacy.download

import org.junit.After
import org.mockito.Mockito

/** Base test class of all test classes.  */
open class DownloadBaseTest {

    /** See [Memory leak in mockito-inline...](https://github.com/mockito/mockito/issues/1614)  */
    @After
    fun clearMocks() {
        Mockito.framework().clearInlineMocks()
    }

    companion object {
        const val MANIFEST_URL =
            "https://dev-domain-url.com/miniapp/78d85043-d04f-486a-8212-bf2601cb63a2" +
                    "/version/17bccee1-17f0-44fa-8cb8-2da89eb49905/manifest/"

        const val FILE_URL = "https://dev-domain-url.com/version" +
                "/17bccee1-17f0-44fa-8cb8-2da89eb49905/js/index.html"

        const val BASE_URL = "https://www.example.com/"
    }
}
