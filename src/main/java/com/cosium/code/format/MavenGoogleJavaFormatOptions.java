package com.cosium.code.format;

import org.apache.maven.plugins.annotations.Parameter;
import com.cosium.code.format.formatter.GoogleJavaFormatterOptions;

/** @author Réda Housni Alaoui */
public class MavenGoogleJavaFormatOptions {

  @Parameter private boolean aosp;
  @Parameter private boolean fixImportsOnly;
  @Parameter private boolean skipSortingImports;
  @Parameter private boolean skipRemovingUnusedImports;
  @Parameter private int maxLineLength = 100;

  public GoogleJavaFormatterOptions toFormatterOptions() {
    return new GoogleJavaFormatterOptions(
        aosp, fixImportsOnly, skipSortingImports, skipRemovingUnusedImports, maxLineLength);
  }

  public void setAosp(boolean aosp) {
    this.aosp = aosp;
  }

  public void setFixImportsOnly(boolean fixImportsOnly) {
    this.fixImportsOnly = fixImportsOnly;
  }

  public void setSkipSortingImports(boolean skipSortingImports) {
    this.skipSortingImports = skipSortingImports;
  }

  public void setSkipRemovingUnusedImports(boolean skipRemovingUnusedImports) {
    this.skipRemovingUnusedImports = skipRemovingUnusedImports;
  }
  
  public void setMaxLineLength(int maxLineLength) {
    this.maxLineLength = maxLineLength;
  }
}
