package example

import example.model.Tag
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._
// See imports for Play JSON at https://github.com/playframework/play-json#constructing-reads-and-writes

import java.nio.charset.StandardCharsets.UTF_8

class TagsTest extends AnyFlatSpec {

  def loadStringFromTestResources(path: String): String =
    new String(getClass.getClassLoader.getResourceAsStream(path).readAllBytes(), UTF_8)

  "Decoding JSON" should "get us actual Tag model objects" in {
    val tagsJsonString = loadStringFromTestResources("samples/tags.json")
//    val json: JsValue = ???
//    val tags: Seq[Tag] = ???
  }

  "Encoding a Tag" should "get us some JSON!" in {
    val tag = Tag("News (Tone)", "tone/news")
    //    val json: JsValue = ???
  }
}
