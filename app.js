function StringSplit(inStr) {
  var out = inStr.split(" ");


  var html = "*********<br>";
  var i;
  for (i = 0; i < out.length; i++) {
      html += "* "+ out[i] + " *<br>";
  }
  html += "*********<br>";
  return html:
}
