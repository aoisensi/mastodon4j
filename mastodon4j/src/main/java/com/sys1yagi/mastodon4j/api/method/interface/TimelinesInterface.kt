package com.sys1yagi.mastodon4j.api.method.`interface`

import com.sys1yagi.mastodon4j.api.Range
import com.sys1yagi.mastodon4j.api.entity.Status

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#timelines
 */
interface TimelinesInterface {
    interface Public {
        fun getPublic(range: Range = Range()): List<Status>
        fun getTag(tag: String, range: Range = Range()): List<Status>
    }

    interface AuthRequired {
        fun getHome(range: Range = Range()): List<Status>
    }
}
