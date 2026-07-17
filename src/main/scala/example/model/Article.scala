package example.model

import java.time.Instant
// See imports for Play JSON at https://github.com/playframework/play-json#constructing-reads-and-writes

case class Article(id: String, title: String, publishedAt: Instant, tags: Seq[Tag])
