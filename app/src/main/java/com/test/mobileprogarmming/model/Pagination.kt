package com.test.mobileprogarmming.model

import com.test.mobileprogarmming.model.Links

data class Pagination(val total: Int, val pages: Int, val page: Int, val limit: Int, val LinksObject: Links)