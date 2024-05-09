package com.cosium.code.format.formatter;

import static com.google.googlejavaformat.java.JavaFormatterOptions.Style.AOSP;
import static com.google.googlejavaformat.java.JavaFormatterOptions.Style.GOOGLE;
import org.mockito.Mockito;
import com.google.googlejavaformat.java.JavaFormatterOptions;

/** @author Réda Housni Alaoui */
public class GoogleJavaFormatterOptions {

  private final JavaFormatterOptions.Style style;
  private final boolean fixImportsOnly;
  private final boolean skipSortingImports;
  private final boolean skipRemovingUnusedImports;
  private int maxLineLength;

  public GoogleJavaFormatterOptions(
      boolean aosp,
      boolean fixImportsOnly,
      boolean skipSortingImports,
      boolean skipRemovingUnusedImports,
      int maxLineLength) {
    if (aosp) {
      style = AOSP;
    } else {
      style = GOOGLE;
    }
    this.fixImportsOnly = fixImportsOnly;
    this.skipSortingImports = skipSortingImports;
    this.skipRemovingUnusedImports = skipRemovingUnusedImports;
    this.maxLineLength = maxLineLength;
  }

  public JavaFormatterOptions javaFormatterOptions() {
    JavaFormatterOptions options =  Mockito.spy(JavaFormatterOptions.builder().style(style).build());
    Mockito.doReturn(maxLineLength).when(options).maxLineLength();
    return options;
  }

  public boolean isFixImportsOnly() {
    return fixImportsOnly;
  }

  public boolean isSkipSortingImports() {
    return skipSortingImports;
  }

  public boolean isSkipRemovingUnusedImports() {
    return skipRemovingUnusedImports;
  }

  @Override
  public String toString() {
    return "GoogleJavaFormatterOptions{"
        + "style="
        + style
        + ", fixImportsOnly="
        + fixImportsOnly
        + ", skipSortingImports="
        + skipSortingImports
        + ", skipRemovingUnusedImports="
        + skipRemovingUnusedImports
        + '}';
  }
}
