/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.appkit;


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSAttributedString;
import apple.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSATSTypesetter extends NSTypesetter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSATSTypesetter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSATSTypesetter alloc();

	@Generated
	@Selector("attributedString")
	public native NSAttributedString attributedString();

	@Generated
	@Selector("bidiProcessingEnabled")
	public native boolean bidiProcessingEnabled();

	@Generated
	@Selector("boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
	@ByValue
	public native CGRect boundingBoxForControlGlyphAtIndexForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
			long glyphIndex, NSTextContainer textContainer,
			@ByValue CGRect proposedRect, @ByValue CGPoint glyphPosition,
			long charIndex);

	@Generated
	@Selector("characterRangeForGlyphRange:actualGlyphRange:")
	@ByValue
	public native NSRange characterRangeForGlyphRangeActualGlyphRange(
			@ByValue NSRange glyphRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualGlyphRange);

	@Generated
	@Selector("currentTextContainer")
	public native NSTextContainer currentTextContainer();

	@Generated
	@Selector("deleteGlyphsInRange:")
	public native void deleteGlyphsInRange(@ByValue NSRange glyphRange);

	@Generated
	@Selector("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:")
	public native long getGlyphsInRangeGlyphsCharacterIndexesGlyphInscriptionsElasticBits(
			@ByValue NSRange glyphsRange, IntPtr glyphBuffer,
			LongPtr charIndexBuffer, LongPtr inscribeBuffer,
			BoolPtr elasticBuffer);

	@Generated
	@Selector("getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:")
	public native void getLineFragmentRectUsedRectForParagraphSeparatorGlyphRangeAtProposedOrigin(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect lineFragmentRect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect lineFragmentUsedRect,
			@ByValue NSRange paragraphSeparatorGlyphRange,
			@ByValue CGPoint lineOrigin);

	@Generated
	@Selector("glyphRangeForCharacterRange:actualCharacterRange:")
	@ByValue
	public native NSRange glyphRangeForCharacterRangeActualCharacterRange(
			@ByValue NSRange charRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualCharRange);

	@Generated
	@Selector("hyphenCharacterForGlyphAtIndex:")
	public native int hyphenCharacterForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("hyphenationFactor")
	public native float hyphenationFactor();

	@Generated
	@Selector("hyphenationFactorForGlyphAtIndex:")
	public native float hyphenationFactorForGlyphAtIndex(long glyphIndex);

	@Generated
	@Selector("init")
	public native NSATSTypesetter init();

	@Generated
	@Selector("insertGlyph:atGlyphIndex:characterIndex:")
	public native void insertGlyphAtGlyphIndexCharacterIndex(int glyph,
			long glyphIndex, long characterIndex);

	@Generated
	@Selector("layoutManager")
	public native NSLayoutManager layoutManager();

	@Generated
	@Selector("layoutParagraphAtPoint:")
	public native long layoutParagraphAtPoint(
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint lineFragmentOrigin);

	@Generated
	@Selector("lineFragmentPadding")
	public native double lineFragmentPadding();

	@Generated
	@Selector("lineFragmentRectForProposedRect:remainingRect:")
	@ByValue
	public native CGRect lineFragmentRectForProposedRectRemainingRect(
			@ByValue CGRect proposedRect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect remainingRect);

	@Generated
	@Selector("lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
	public native double lineSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
			long glyphIndex, @ByValue CGRect rect);

	@Generated
	@Selector("paragraphGlyphRange")
	@ByValue
	public native NSRange paragraphGlyphRange();

	@Generated
	@Selector("paragraphSeparatorGlyphRange")
	@ByValue
	public native NSRange paragraphSeparatorGlyphRange();

	@Generated
	@Selector("paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
	public native double paragraphSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
			long glyphIndex, @ByValue CGRect rect);

	@Generated
	@Selector("paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
	public native double paragraphSpacingBeforeGlyphAtIndexWithProposedLineFragmentRect(
			long glyphIndex, @ByValue CGRect rect);

	@Generated
	@Selector("setAttachmentSize:forGlyphRange:")
	public native void setAttachmentSizeForGlyphRange(
			@ByValue CGSize attachmentSize, @ByValue NSRange glyphRange);

	@Generated
	@Selector("setAttributedString:")
	public native void setAttributedString(NSAttributedString attrString);

	@Generated
	@Selector("setBidiLevels:forGlyphRange:")
	public native void setBidiLevelsForGlyphRange(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String levels,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setBidiProcessingEnabled:")
	public native void setBidiProcessingEnabled(boolean flag);

	@Generated
	@Selector("setDrawsOutsideLineFragment:forGlyphRange:")
	public native void setDrawsOutsideLineFragmentForGlyphRange(boolean flag,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setHardInvalidation:forGlyphRange:")
	public native void setHardInvalidationForGlyphRange(boolean flag,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setHyphenationFactor:")
	public native void setHyphenationFactor(float factor);

	@Generated
	@Selector("setLineFragmentPadding:")
	public native void setLineFragmentPadding(double padding);

	@Generated
	@Selector("setLineFragmentRect:forGlyphRange:usedRect:baselineOffset:")
	public native void setLineFragmentRectForGlyphRangeUsedRectBaselineOffset(
			@ByValue CGRect fragmentRect, @ByValue NSRange glyphRange,
			@ByValue CGRect usedRect, double baselineOffset);

	@Generated
	@Selector("setLocation:withAdvancements:forStartOfGlyphRange:")
	public native void setLocationWithAdvancementsForStartOfGlyphRange(
			@ByValue CGPoint location, ConstDoublePtr advancements,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setNotShownAttribute:forGlyphRange:")
	public native void setNotShownAttributeForGlyphRange(boolean flag,
			@ByValue NSRange glyphRange);

	@Generated
	@Selector("setParagraphGlyphRange:separatorGlyphRange:")
	public native void setParagraphGlyphRangeSeparatorGlyphRange(
			@ByValue NSRange paragraphRange,
			@ByValue NSRange paragraphSeparatorRange);

	@Generated
	@Selector("setTypesetterBehavior:")
	public native void setTypesetterBehavior(long behavior);

	@Generated
	@Selector("setUsesFontLeading:")
	public native void setUsesFontLeading(boolean flag);

	@Generated
	@Selector("sharedTypesetter")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedTypesetter();

	@Generated
	@Selector("shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
	public native boolean shouldBreakLineByHyphenatingBeforeCharacterAtIndex(
			long charIndex);

	@Generated
	@Selector("shouldBreakLineByWordBeforeCharacterAtIndex:")
	public native boolean shouldBreakLineByWordBeforeCharacterAtIndex(
			long charIndex);

	@Generated
	@Selector("substituteFontForFont:")
	public native NSFont substituteFontForFont(NSFont originalFont);

	@Generated
	@Selector("substituteGlyphsInRange:withGlyphs:")
	public native void substituteGlyphsInRangeWithGlyphs(
			@ByValue NSRange glyphRange, IntPtr glyphs);

	@Generated
	@Selector("textTabForGlyphLocation:writingDirection:maxLocation:")
	public native NSTextTab textTabForGlyphLocationWritingDirectionMaxLocation(
			double glyphLocation, long direction, double maxLocation);

	@Generated
	@Selector("typesetterBehavior")
	public native long typesetterBehavior();

	@Generated
	@Selector("usesFontLeading")
	public native boolean usesFontLeading();

	@Generated
	@Selector("willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:")
	public native void willSetLineFragmentRectForGlyphRangeUsedRectBaselineOffset(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect lineRect,
			@ByValue NSRange glyphRange,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect usedRect,
			DoublePtr baselineOffset);
}
