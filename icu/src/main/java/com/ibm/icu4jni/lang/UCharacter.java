/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.icu4jni.lang;

import java.lang.Character.UnicodeBlock;

public class UCharacter {

    public static native boolean isDefined(int codePoint);
    public static native boolean isDigit(int codePoint);
    public static native boolean isIdentifierIgnorable(int codePoint);
    public static native boolean isLetter(int codePoint);
    public static native boolean isLetterOrDigit(int codePoint);
    public static native boolean isLowerCase(int codePoint);
    public static native boolean isMirrored(int codePoint);
    public static native boolean isSpaceChar(int codePoint);
    public static native boolean isTitleCase(int codePoint);
    public static native boolean isUnicodeIdentifierPart(int codePoint);
    public static native boolean isUnicodeIdentifierStart(int codePoint);
    public static native boolean isUpperCase(int codePoint);
    public static native boolean isWhitespace(int codePoint);
    public static native byte getDirectionality(int codePoint);
    public static native int digit(int codePoint, int radix);
    public static native int forName(String blockName);
    public static native int getNumericValue(int codePoint);
    public static native int getType(int codePoint);
    public static native int of(int codePoint);
    public static native int toLowerCase(int codePoint);
    public static native int toTitleCase(int codePoint);
    public static native int toUpperCase(int codePoint);

    public static UnicodeBlock[] getBlockTable() {
        /**
         * The indices of the entries of this table correspond with the value
         * of the ICU enum UBlockCode. When updating ICU it's necessary
         * to check if there where any changes for the properties
         * used by java.lang.Character. 
         * The enum is defined in common/unicode/uchar.h
         */
        UnicodeBlock[] result = new UnicodeBlock[] { null,
                UnicodeBlock.BASIC_LATIN,
                UnicodeBlock.LATIN_1_SUPPLEMENT,
                UnicodeBlock.LATIN_EXTENDED_A,
                UnicodeBlock.LATIN_EXTENDED_B,
                UnicodeBlock.IPA_EXTENSIONS,
                UnicodeBlock.SPACING_MODIFIER_LETTERS,
                UnicodeBlock.COMBINING_DIACRITICAL_MARKS,
                UnicodeBlock.GREEK,
                UnicodeBlock.CYRILLIC,
                UnicodeBlock.ARMENIAN,
                UnicodeBlock.HEBREW,
                UnicodeBlock.ARABIC,
                UnicodeBlock.SYRIAC,
                UnicodeBlock.THAANA,
                UnicodeBlock.DEVANAGARI,
                UnicodeBlock.BENGALI,
                UnicodeBlock.GURMUKHI,
                UnicodeBlock.GUJARATI,
                UnicodeBlock.ORIYA,
                UnicodeBlock.TAMIL,
                UnicodeBlock.TELUGU,
                UnicodeBlock.KANNADA,
                UnicodeBlock.MALAYALAM,
                UnicodeBlock.SINHALA,
                UnicodeBlock.THAI,
                UnicodeBlock.LAO,
                UnicodeBlock.TIBETAN,
                UnicodeBlock.MYANMAR,
                UnicodeBlock.GEORGIAN,
                UnicodeBlock.HANGUL_JAMO,
                UnicodeBlock.ETHIOPIC,
                UnicodeBlock.CHEROKEE,
                UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS,
                UnicodeBlock.OGHAM,
                UnicodeBlock.RUNIC,
                UnicodeBlock.KHMER,
                UnicodeBlock.MONGOLIAN,
                UnicodeBlock.LATIN_EXTENDED_ADDITIONAL,
                UnicodeBlock.GREEK_EXTENDED,
                UnicodeBlock.GENERAL_PUNCTUATION,
                UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS,
                UnicodeBlock.CURRENCY_SYMBOLS,
                UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS,
                UnicodeBlock.LETTERLIKE_SYMBOLS,
                UnicodeBlock.NUMBER_FORMS,
                UnicodeBlock.ARROWS,
                UnicodeBlock.MATHEMATICAL_OPERATORS,
                UnicodeBlock.MISCELLANEOUS_TECHNICAL,
                UnicodeBlock.CONTROL_PICTURES,
                UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION,
                UnicodeBlock.ENCLOSED_ALPHANUMERICS,
                UnicodeBlock.BOX_DRAWING,
                UnicodeBlock.BLOCK_ELEMENTS,
                UnicodeBlock.GEOMETRIC_SHAPES,
                UnicodeBlock.MISCELLANEOUS_SYMBOLS,
                UnicodeBlock.DINGBATS,
                UnicodeBlock.BRAILLE_PATTERNS,
                UnicodeBlock.CJK_RADICALS_SUPPLEMENT,
                UnicodeBlock.KANGXI_RADICALS,
                UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS,
                UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION,
                UnicodeBlock.HIRAGANA,
                UnicodeBlock.KATAKANA,
                UnicodeBlock.BOPOMOFO,
                UnicodeBlock.HANGUL_COMPATIBILITY_JAMO,
                UnicodeBlock.KANBUN,
                UnicodeBlock.BOPOMOFO_EXTENDED,
                UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS,
                UnicodeBlock.CJK_COMPATIBILITY,
                UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
                UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS,
                UnicodeBlock.YI_SYLLABLES,
                UnicodeBlock.YI_RADICALS,
                UnicodeBlock.HANGUL_SYLLABLES,
                UnicodeBlock.HIGH_SURROGATES,
                UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES,
                UnicodeBlock.LOW_SURROGATES,
                UnicodeBlock.PRIVATE_USE_AREA,
                UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS,
                UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS,
                UnicodeBlock.ARABIC_PRESENTATION_FORMS_A,
                UnicodeBlock.COMBINING_HALF_MARKS,
                UnicodeBlock.CJK_COMPATIBILITY_FORMS,
                UnicodeBlock.SMALL_FORM_VARIANTS,
                UnicodeBlock.ARABIC_PRESENTATION_FORMS_B,
                UnicodeBlock.SPECIALS,
                UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS,
                UnicodeBlock.OLD_ITALIC,
                UnicodeBlock.GOTHIC,
                UnicodeBlock.DESERET,
                UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS,
                UnicodeBlock.MUSICAL_SYMBOLS,
                UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS,
                UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
                UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT,
                UnicodeBlock.TAGS,
                UnicodeBlock.CYRILLIC_SUPPLEMENTARY,
                UnicodeBlock.TAGALOG,
                UnicodeBlock.HANUNOO,
                UnicodeBlock.BUHID,
                UnicodeBlock.TAGBANWA,
                UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A,
                UnicodeBlock.SUPPLEMENTAL_ARROWS_A,
                UnicodeBlock.SUPPLEMENTAL_ARROWS_B,
                UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B,
                UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS,
                UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS,
                UnicodeBlock.VARIATION_SELECTORS,
                UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A,
                UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B,
                UnicodeBlock.LIMBU,
                UnicodeBlock.TAI_LE,
                UnicodeBlock.KHMER_SYMBOLS,
                UnicodeBlock.PHONETIC_EXTENSIONS,
                UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS,
                UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS,
                UnicodeBlock.LINEAR_B_SYLLABARY,
                UnicodeBlock.LINEAR_B_IDEOGRAMS,
                UnicodeBlock.AEGEAN_NUMBERS,
                UnicodeBlock.UGARITIC,
                UnicodeBlock.SHAVIAN,
                UnicodeBlock.OSMANYA,
                UnicodeBlock.CYPRIOT_SYLLABARY,
                UnicodeBlock.TAI_XUAN_JING_SYMBOLS,
                UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT
        };
        return result;
    }
}
