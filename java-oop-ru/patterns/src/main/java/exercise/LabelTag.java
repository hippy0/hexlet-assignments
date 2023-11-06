package exercise;

// BEGIN
public class LabelTag implements TagInterface {

  private final String textContent;
  private final TagInterface inputTag;

  public LabelTag(String textContent, TagInterface inputTag) {
    this.textContent = textContent;
    this.inputTag = inputTag;
  }

  @Override
  public String render() {
    return "<label>" + this.textContent + inputTag.render() + "</label>";
  }
}
// END
