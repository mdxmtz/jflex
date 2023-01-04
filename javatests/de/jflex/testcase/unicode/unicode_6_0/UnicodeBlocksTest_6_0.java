/*
 * Copyright (C) 2021 Google, LLC.
 * SPDX-License-Identifier: BSD-3-Clause
 */
package de.jflex.testcase.unicode.unicode_6_0;

import static com.google.common.truth.Truth.assertThat;

import de.jflex.testing.unicodedata.UnicodeDataScanners;
import de.jflex.ucd.NamedCodepointRange;
import de.jflex.util.scanner.ScannerFactory;
import javax.annotation.Generated;
import org.junit.Test;

/** Test that parsing all Unicode codepoints detects the correct block ranges for Unicode 6.0. */
@Generated("de.jflex.migration.unicodedatatest.testblock.BlocksTestGenerator")
public class UnicodeBlocksTest_6_0 {
  @Test
  public void testBlocks() throws Exception {
    UnicodeBlocks_6_0 scanner =
        UnicodeDataScanners.scanAllCodepoints(
            ScannerFactory.of(UnicodeBlocks_6_0::new),
            UnicodeBlocks_6_0.YYEOF,
            UnicodeDataScanners.Dataset.ALL);
    assertThat(scanner.blocks())
        .containsExactly(
            NamedCodepointRange.create("Basic Latin", 0x0000, 0x007F),
            NamedCodepointRange.create("Latin-1 Supplement", 0x0080, 0x00FF),
            NamedCodepointRange.create("Latin Extended-A", 0x0100, 0x017F),
            NamedCodepointRange.create("Latin Extended-B", 0x0180, 0x024F),
            NamedCodepointRange.create("IPA Extensions", 0x0250, 0x02AF),
            NamedCodepointRange.create("Spacing Modifier Letters", 0x02B0, 0x02FF),
            NamedCodepointRange.create("Combining Diacritical Marks", 0x0300, 0x036F),
            NamedCodepointRange.create("Greek and Coptic", 0x0370, 0x03FF),
            NamedCodepointRange.create("Cyrillic", 0x0400, 0x04FF),
            NamedCodepointRange.create("Cyrillic Supplement", 0x0500, 0x052F),
            NamedCodepointRange.create("Armenian", 0x0530, 0x058F),
            NamedCodepointRange.create("Hebrew", 0x0590, 0x05FF),
            NamedCodepointRange.create("Arabic", 0x0600, 0x06FF),
            NamedCodepointRange.create("Syriac", 0x0700, 0x074F),
            NamedCodepointRange.create("Arabic Supplement", 0x0750, 0x077F),
            NamedCodepointRange.create("Thaana", 0x0780, 0x07BF),
            NamedCodepointRange.create("NKo", 0x07C0, 0x07FF),
            NamedCodepointRange.create("Samaritan", 0x0800, 0x083F),
            NamedCodepointRange.create("Mandaic", 0x0840, 0x085F),
            NamedCodepointRange.create("No Block", 0x0860, 0x08FF),
            NamedCodepointRange.create("Devanagari", 0x0900, 0x097F),
            NamedCodepointRange.create("Bengali", 0x0980, 0x09FF),
            NamedCodepointRange.create("Gurmukhi", 0x0A00, 0x0A7F),
            NamedCodepointRange.create("Gujarati", 0x0A80, 0x0AFF),
            NamedCodepointRange.create("Oriya", 0x0B00, 0x0B7F),
            NamedCodepointRange.create("Tamil", 0x0B80, 0x0BFF),
            NamedCodepointRange.create("Telugu", 0x0C00, 0x0C7F),
            NamedCodepointRange.create("Kannada", 0x0C80, 0x0CFF),
            NamedCodepointRange.create("Malayalam", 0x0D00, 0x0D7F),
            NamedCodepointRange.create("Sinhala", 0x0D80, 0x0DFF),
            NamedCodepointRange.create("Thai", 0x0E00, 0x0E7F),
            NamedCodepointRange.create("Lao", 0x0E80, 0x0EFF),
            NamedCodepointRange.create("Tibetan", 0x0F00, 0x0FFF),
            NamedCodepointRange.create("Myanmar", 0x1000, 0x109F),
            NamedCodepointRange.create("Georgian", 0x10A0, 0x10FF),
            NamedCodepointRange.create("Hangul Jamo", 0x1100, 0x11FF),
            NamedCodepointRange.create("Ethiopic", 0x1200, 0x137F),
            NamedCodepointRange.create("Ethiopic Supplement", 0x1380, 0x139F),
            NamedCodepointRange.create("Cherokee", 0x13A0, 0x13FF),
            NamedCodepointRange.create("Unified Canadian Aboriginal Syllabics", 0x1400, 0x167F),
            NamedCodepointRange.create("Ogham", 0x1680, 0x169F),
            NamedCodepointRange.create("Runic", 0x16A0, 0x16FF),
            NamedCodepointRange.create("Tagalog", 0x1700, 0x171F),
            NamedCodepointRange.create("Hanunoo", 0x1720, 0x173F),
            NamedCodepointRange.create("Buhid", 0x1740, 0x175F),
            NamedCodepointRange.create("Tagbanwa", 0x1760, 0x177F),
            NamedCodepointRange.create("Khmer", 0x1780, 0x17FF),
            NamedCodepointRange.create("Mongolian", 0x1800, 0x18AF),
            NamedCodepointRange.create(
                "Unified Canadian Aboriginal Syllabics Extended", 0x18B0, 0x18FF),
            NamedCodepointRange.create("Limbu", 0x1900, 0x194F),
            NamedCodepointRange.create("Tai Le", 0x1950, 0x197F),
            NamedCodepointRange.create("New Tai Lue", 0x1980, 0x19DF),
            NamedCodepointRange.create("Khmer Symbols", 0x19E0, 0x19FF),
            NamedCodepointRange.create("Buginese", 0x1A00, 0x1A1F),
            NamedCodepointRange.create("Tai Tham", 0x1A20, 0x1AAF),
            NamedCodepointRange.create("No Block", 0x1AB0, 0x1AFF),
            NamedCodepointRange.create("Balinese", 0x1B00, 0x1B7F),
            NamedCodepointRange.create("Sundanese", 0x1B80, 0x1BBF),
            NamedCodepointRange.create("Batak", 0x1BC0, 0x1BFF),
            NamedCodepointRange.create("Lepcha", 0x1C00, 0x1C4F),
            NamedCodepointRange.create("Ol Chiki", 0x1C50, 0x1C7F),
            NamedCodepointRange.create("No Block", 0x1C80, 0x1CCF),
            NamedCodepointRange.create("Vedic Extensions", 0x1CD0, 0x1CFF),
            NamedCodepointRange.create("Phonetic Extensions", 0x1D00, 0x1D7F),
            NamedCodepointRange.create("Phonetic Extensions Supplement", 0x1D80, 0x1DBF),
            NamedCodepointRange.create("Combining Diacritical Marks Supplement", 0x1DC0, 0x1DFF),
            NamedCodepointRange.create("Latin Extended Additional", 0x1E00, 0x1EFF),
            NamedCodepointRange.create("Greek Extended", 0x1F00, 0x1FFF),
            NamedCodepointRange.create("General Punctuation", 0x2000, 0x206F),
            NamedCodepointRange.create("Superscripts and Subscripts", 0x2070, 0x209F),
            NamedCodepointRange.create("Currency Symbols", 0x20A0, 0x20CF),
            NamedCodepointRange.create("Combining Diacritical Marks for Symbols", 0x20D0, 0x20FF),
            NamedCodepointRange.create("Letterlike Symbols", 0x2100, 0x214F),
            NamedCodepointRange.create("Number Forms", 0x2150, 0x218F),
            NamedCodepointRange.create("Arrows", 0x2190, 0x21FF),
            NamedCodepointRange.create("Mathematical Operators", 0x2200, 0x22FF),
            NamedCodepointRange.create("Miscellaneous Technical", 0x2300, 0x23FF),
            NamedCodepointRange.create("Control Pictures", 0x2400, 0x243F),
            NamedCodepointRange.create("Optical Character Recognition", 0x2440, 0x245F),
            NamedCodepointRange.create("Enclosed Alphanumerics", 0x2460, 0x24FF),
            NamedCodepointRange.create("Box Drawing", 0x2500, 0x257F),
            NamedCodepointRange.create("Block Elements", 0x2580, 0x259F),
            NamedCodepointRange.create("Geometric Shapes", 0x25A0, 0x25FF),
            NamedCodepointRange.create("Miscellaneous Symbols", 0x2600, 0x26FF),
            NamedCodepointRange.create("Dingbats", 0x2700, 0x27BF),
            NamedCodepointRange.create("Miscellaneous Mathematical Symbols-A", 0x27C0, 0x27EF),
            NamedCodepointRange.create("Supplemental Arrows-A", 0x27F0, 0x27FF),
            NamedCodepointRange.create("Braille Patterns", 0x2800, 0x28FF),
            NamedCodepointRange.create("Supplemental Arrows-B", 0x2900, 0x297F),
            NamedCodepointRange.create("Miscellaneous Mathematical Symbols-B", 0x2980, 0x29FF),
            NamedCodepointRange.create("Supplemental Mathematical Operators", 0x2A00, 0x2AFF),
            NamedCodepointRange.create("Miscellaneous Symbols and Arrows", 0x2B00, 0x2BFF),
            NamedCodepointRange.create("Glagolitic", 0x2C00, 0x2C5F),
            NamedCodepointRange.create("Latin Extended-C", 0x2C60, 0x2C7F),
            NamedCodepointRange.create("Coptic", 0x2C80, 0x2CFF),
            NamedCodepointRange.create("Georgian Supplement", 0x2D00, 0x2D2F),
            NamedCodepointRange.create("Tifinagh", 0x2D30, 0x2D7F),
            NamedCodepointRange.create("Ethiopic Extended", 0x2D80, 0x2DDF),
            NamedCodepointRange.create("Cyrillic Extended-A", 0x2DE0, 0x2DFF),
            NamedCodepointRange.create("Supplemental Punctuation", 0x2E00, 0x2E7F),
            NamedCodepointRange.create("CJK Radicals Supplement", 0x2E80, 0x2EFF),
            NamedCodepointRange.create("Kangxi Radicals", 0x2F00, 0x2FDF),
            NamedCodepointRange.create("No Block", 0x2FE0, 0x2FEF),
            NamedCodepointRange.create("Ideographic Description Characters", 0x2FF0, 0x2FFF),
            NamedCodepointRange.create("CJK Symbols and Punctuation", 0x3000, 0x303F),
            NamedCodepointRange.create("Hiragana", 0x3040, 0x309F),
            NamedCodepointRange.create("Katakana", 0x30A0, 0x30FF),
            NamedCodepointRange.create("Bopomofo", 0x3100, 0x312F),
            NamedCodepointRange.create("Hangul Compatibility Jamo", 0x3130, 0x318F),
            NamedCodepointRange.create("Kanbun", 0x3190, 0x319F),
            NamedCodepointRange.create("Bopomofo Extended", 0x31A0, 0x31BF),
            NamedCodepointRange.create("CJK Strokes", 0x31C0, 0x31EF),
            NamedCodepointRange.create("Katakana Phonetic Extensions", 0x31F0, 0x31FF),
            NamedCodepointRange.create("Enclosed CJK Letters and Months", 0x3200, 0x32FF),
            NamedCodepointRange.create("CJK Compatibility", 0x3300, 0x33FF),
            NamedCodepointRange.create("CJK Unified Ideographs Extension A", 0x3400, 0x4DBF),
            NamedCodepointRange.create("Yijing Hexagram Symbols", 0x4DC0, 0x4DFF),
            NamedCodepointRange.create("CJK Unified Ideographs", 0x4E00, 0x9FFF),
            NamedCodepointRange.create("Yi Syllables", 0xA000, 0xA48F),
            NamedCodepointRange.create("Yi Radicals", 0xA490, 0xA4CF),
            NamedCodepointRange.create("Lisu", 0xA4D0, 0xA4FF),
            NamedCodepointRange.create("Vai", 0xA500, 0xA63F),
            NamedCodepointRange.create("Cyrillic Extended-B", 0xA640, 0xA69F),
            NamedCodepointRange.create("Bamum", 0xA6A0, 0xA6FF),
            NamedCodepointRange.create("Modifier Tone Letters", 0xA700, 0xA71F),
            NamedCodepointRange.create("Latin Extended-D", 0xA720, 0xA7FF),
            NamedCodepointRange.create("Syloti Nagri", 0xA800, 0xA82F),
            NamedCodepointRange.create("Common Indic Number Forms", 0xA830, 0xA83F),
            NamedCodepointRange.create("Phags-pa", 0xA840, 0xA87F),
            NamedCodepointRange.create("Saurashtra", 0xA880, 0xA8DF),
            NamedCodepointRange.create("Devanagari Extended", 0xA8E0, 0xA8FF),
            NamedCodepointRange.create("Kayah Li", 0xA900, 0xA92F),
            NamedCodepointRange.create("Rejang", 0xA930, 0xA95F),
            NamedCodepointRange.create("Hangul Jamo Extended-A", 0xA960, 0xA97F),
            NamedCodepointRange.create("Javanese", 0xA980, 0xA9DF),
            NamedCodepointRange.create("No Block", 0xA9E0, 0xA9FF),
            NamedCodepointRange.create("Cham", 0xAA00, 0xAA5F),
            NamedCodepointRange.create("Myanmar Extended-A", 0xAA60, 0xAA7F),
            NamedCodepointRange.create("Tai Viet", 0xAA80, 0xAADF),
            NamedCodepointRange.create("No Block", 0xAAE0, 0xAAFF),
            NamedCodepointRange.create("Ethiopic Extended-A", 0xAB00, 0xAB2F),
            NamedCodepointRange.create("No Block", 0xAB30, 0xABBF),
            NamedCodepointRange.create("Meetei Mayek", 0xABC0, 0xABFF),
            NamedCodepointRange.create("Hangul Syllables", 0xAC00, 0xD7AF),
            NamedCodepointRange.create("Hangul Jamo Extended-B", 0xD7B0, 0xD7FF),
            NamedCodepointRange.create("Private Use Area", 0xE000, 0xF8FF),
            NamedCodepointRange.create("CJK Compatibility Ideographs", 0xF900, 0xFAFF),
            NamedCodepointRange.create("Alphabetic Presentation Forms", 0xFB00, 0xFB4F),
            NamedCodepointRange.create("Arabic Presentation Forms-A", 0xFB50, 0xFDFF),
            NamedCodepointRange.create("Variation Selectors", 0xFE00, 0xFE0F),
            NamedCodepointRange.create("Vertical Forms", 0xFE10, 0xFE1F),
            NamedCodepointRange.create("Combining Half Marks", 0xFE20, 0xFE2F),
            NamedCodepointRange.create("CJK Compatibility Forms", 0xFE30, 0xFE4F),
            NamedCodepointRange.create("Small Form Variants", 0xFE50, 0xFE6F),
            NamedCodepointRange.create("Arabic Presentation Forms-B", 0xFE70, 0xFEFF),
            NamedCodepointRange.create("Halfwidth and Fullwidth Forms", 0xFF00, 0xFFEF),
            NamedCodepointRange.create("Specials", 0xFFF0, 0xFFFF),
            NamedCodepointRange.create("Linear B Syllabary", 0x10000, 0x1007F),
            NamedCodepointRange.create("Linear B Ideograms", 0x10080, 0x100FF),
            NamedCodepointRange.create("Aegean Numbers", 0x10100, 0x1013F),
            NamedCodepointRange.create("Ancient Greek Numbers", 0x10140, 0x1018F),
            NamedCodepointRange.create("Ancient Symbols", 0x10190, 0x101CF),
            NamedCodepointRange.create("Phaistos Disc", 0x101D0, 0x101FF),
            NamedCodepointRange.create("No Block", 0x10200, 0x1027F),
            NamedCodepointRange.create("Lycian", 0x10280, 0x1029F),
            NamedCodepointRange.create("Carian", 0x102A0, 0x102DF),
            NamedCodepointRange.create("No Block", 0x102E0, 0x102FF),
            NamedCodepointRange.create("Old Italic", 0x10300, 0x1032F),
            NamedCodepointRange.create("Gothic", 0x10330, 0x1034F),
            NamedCodepointRange.create("No Block", 0x10350, 0x1037F),
            NamedCodepointRange.create("Ugaritic", 0x10380, 0x1039F),
            NamedCodepointRange.create("Old Persian", 0x103A0, 0x103DF),
            NamedCodepointRange.create("No Block", 0x103E0, 0x103FF),
            NamedCodepointRange.create("Deseret", 0x10400, 0x1044F),
            NamedCodepointRange.create("Shavian", 0x10450, 0x1047F),
            NamedCodepointRange.create("Osmanya", 0x10480, 0x104AF),
            NamedCodepointRange.create("No Block", 0x104B0, 0x107FF),
            NamedCodepointRange.create("Cypriot Syllabary", 0x10800, 0x1083F),
            NamedCodepointRange.create("Imperial Aramaic", 0x10840, 0x1085F),
            NamedCodepointRange.create("No Block", 0x10860, 0x108FF),
            NamedCodepointRange.create("Phoenician", 0x10900, 0x1091F),
            NamedCodepointRange.create("Lydian", 0x10920, 0x1093F),
            NamedCodepointRange.create("No Block", 0x10940, 0x109FF),
            NamedCodepointRange.create("Kharoshthi", 0x10A00, 0x10A5F),
            NamedCodepointRange.create("Old South Arabian", 0x10A60, 0x10A7F),
            NamedCodepointRange.create("No Block", 0x10A80, 0x10AFF),
            NamedCodepointRange.create("Avestan", 0x10B00, 0x10B3F),
            NamedCodepointRange.create("Inscriptional Parthian", 0x10B40, 0x10B5F),
            NamedCodepointRange.create("Inscriptional Pahlavi", 0x10B60, 0x10B7F),
            NamedCodepointRange.create("No Block", 0x10B80, 0x10BFF),
            NamedCodepointRange.create("Old Turkic", 0x10C00, 0x10C4F),
            NamedCodepointRange.create("No Block", 0x10C50, 0x10E5F),
            NamedCodepointRange.create("Rumi Numeral Symbols", 0x10E60, 0x10E7F),
            NamedCodepointRange.create("No Block", 0x10E80, 0x10FFF),
            NamedCodepointRange.create("Brahmi", 0x11000, 0x1107F),
            NamedCodepointRange.create("Kaithi", 0x11080, 0x110CF),
            NamedCodepointRange.create("No Block", 0x110D0, 0x11FFF),
            NamedCodepointRange.create("Cuneiform", 0x12000, 0x123FF),
            NamedCodepointRange.create("Cuneiform Numbers and Punctuation", 0x12400, 0x1247F),
            NamedCodepointRange.create("No Block", 0x12480, 0x12FFF),
            NamedCodepointRange.create("Egyptian Hieroglyphs", 0x13000, 0x1342F),
            NamedCodepointRange.create("No Block", 0x13430, 0x167FF),
            NamedCodepointRange.create("Bamum Supplement", 0x16800, 0x16A3F),
            NamedCodepointRange.create("No Block", 0x16A40, 0x1AFFF),
            NamedCodepointRange.create("Kana Supplement", 0x1B000, 0x1B0FF),
            NamedCodepointRange.create("No Block", 0x1B100, 0x1CFFF),
            NamedCodepointRange.create("Byzantine Musical Symbols", 0x1D000, 0x1D0FF),
            NamedCodepointRange.create("Musical Symbols", 0x1D100, 0x1D1FF),
            NamedCodepointRange.create("Ancient Greek Musical Notation", 0x1D200, 0x1D24F),
            NamedCodepointRange.create("No Block", 0x1D250, 0x1D2FF),
            NamedCodepointRange.create("Tai Xuan Jing Symbols", 0x1D300, 0x1D35F),
            NamedCodepointRange.create("Counting Rod Numerals", 0x1D360, 0x1D37F),
            NamedCodepointRange.create("No Block", 0x1D380, 0x1D3FF),
            NamedCodepointRange.create("Mathematical Alphanumeric Symbols", 0x1D400, 0x1D7FF),
            NamedCodepointRange.create("No Block", 0x1D800, 0x1EFFF),
            NamedCodepointRange.create("Mahjong Tiles", 0x1F000, 0x1F02F),
            NamedCodepointRange.create("Domino Tiles", 0x1F030, 0x1F09F),
            NamedCodepointRange.create("Playing Cards", 0x1F0A0, 0x1F0FF),
            NamedCodepointRange.create("Enclosed Alphanumeric Supplement", 0x1F100, 0x1F1FF),
            NamedCodepointRange.create("Enclosed Ideographic Supplement", 0x1F200, 0x1F2FF),
            NamedCodepointRange.create("Miscellaneous Symbols And Pictographs", 0x1F300, 0x1F5FF),
            NamedCodepointRange.create("Emoticons", 0x1F600, 0x1F64F),
            NamedCodepointRange.create("No Block", 0x1F650, 0x1F67F),
            NamedCodepointRange.create("Transport And Map Symbols", 0x1F680, 0x1F6FF),
            NamedCodepointRange.create("Alchemical Symbols", 0x1F700, 0x1F77F),
            NamedCodepointRange.create("No Block", 0x1F780, 0x1FFFF),
            NamedCodepointRange.create("CJK Unified Ideographs Extension B", 0x20000, 0x2A6DF),
            NamedCodepointRange.create("No Block", 0x2A6E0, 0x2A6FF),
            NamedCodepointRange.create("CJK Unified Ideographs Extension C", 0x2A700, 0x2B73F),
            NamedCodepointRange.create("CJK Unified Ideographs Extension D", 0x2B740, 0x2B81F),
            NamedCodepointRange.create("No Block", 0x2B820, 0x2F7FF),
            NamedCodepointRange.create("CJK Compatibility Ideographs Supplement", 0x2F800, 0x2FA1F),
            NamedCodepointRange.create("No Block", 0x2FA20, 0xDFFFF),
            NamedCodepointRange.create("Tags", 0xE0000, 0xE007F),
            NamedCodepointRange.create("No Block", 0xE0080, 0xE00FF),
            NamedCodepointRange.create("Variation Selectors Supplement", 0xE0100, 0xE01EF),
            NamedCodepointRange.create("No Block", 0xE01F0, 0xEFFFF),
            NamedCodepointRange.create("Supplementary Private Use Area-A", 0xF0000, 0xFFFFF),
            NamedCodepointRange.create("Supplementary Private Use Area-B", 0x100000, 0x10FFFF));
  }
}
