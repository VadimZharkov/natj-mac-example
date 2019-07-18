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

package apple.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.protocol.NSCoding;
import apple.quartzcore.protocol.CAMediaTiming;
import apple.quartzcore.struct.CATransform3D;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CALayer extends NSObject implements NSCoding, CAMediaTiming {
	static {
		NatJ.register();
	}

	@Generated
	protected CALayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("actionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object actionForKey(String event);

	@Generated
	@Selector("actions")
	public native NSDictionary actions();

	@Generated
	@Selector("addSublayer:")
	public native void addSublayer(CALayer layer);

	@Generated
	@Selector("affineTransform")
	@ByValue
	public native CGAffineTransform affineTransform();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CALayer alloc();

	@Generated
	@Selector("anchorPoint")
	@ByValue
	public native CGPoint anchorPoint();

	@Generated
	@Selector("anchorPointZ")
	public native double anchorPointZ();

	@Generated
	@Selector("animationKeys")
	public native NSArray animationKeys();

	@Generated
	@Selector("autoresizingMask")
	public native int autoresizingMask();

	@Generated
	@Selector("autoreverses")
	public native boolean autoreverses();

	@Generated
	@Selector("backgroundColor")
	public native CGColorRef backgroundColor();

	@Generated
	@Selector("backgroundFilters")
	public native NSArray backgroundFilters();

	@Generated
	@Selector("beginTime")
	public native double beginTime();

	@Generated
	@Selector("borderColor")
	public native CGColorRef borderColor();

	@Generated
	@Selector("borderWidth")
	public native double borderWidth();

	@Generated
	@Selector("bounds")
	@ByValue
	public native CGRect bounds();

	@Generated
	@Selector("compositingFilter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object compositingFilter();

	@Generated
	@Selector("containsPoint:")
	public native boolean containsPoint(@ByValue CGPoint p);

	@Generated
	@Selector("contents")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contents();

	@Generated
	@Selector("contentsAreFlipped")
	public native boolean contentsAreFlipped();

	@Generated
	@Selector("contentsCenter")
	@ByValue
	public native CGRect contentsCenter();

	@Generated
	@Selector("contentsGravity")
	public native String contentsGravity();

	@Generated
	@Selector("contentsRect")
	@ByValue
	public native CGRect contentsRect();

	@Generated
	@Selector("contentsScale")
	public native double contentsScale();

	@Generated
	@Selector("convertPoint:fromLayer:")
	@ByValue
	public native CGPoint convertPointFromLayer(@ByValue CGPoint p, CALayer l);

	@Generated
	@Selector("convertPoint:toLayer:")
	@ByValue
	public native CGPoint convertPointToLayer(@ByValue CGPoint p, CALayer l);

	@Generated
	@Selector("convertRect:fromLayer:")
	@ByValue
	public native CGRect convertRectFromLayer(@ByValue CGRect r, CALayer l);

	@Generated
	@Selector("convertRect:toLayer:")
	@ByValue
	public native CGRect convertRectToLayer(@ByValue CGRect r, CALayer l);

	@Generated
	@Selector("convertTime:fromLayer:")
	public native double convertTimeFromLayer(double t, CALayer l);

	@Generated
	@Selector("convertTime:toLayer:")
	public native double convertTimeToLayer(double t, CALayer l);

	@Generated
	@Selector("cornerRadius")
	public native double cornerRadius();

	@Generated
	@Selector("defaultActionForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultActionForKey(String event);

	@Generated
	@Selector("defaultValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultValueForKey(String key);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("display")
	public native void display();

	@Generated
	@Selector("displayIfNeeded")
	public native void displayIfNeeded();

	@Generated
	@Selector("drawInContext:")
	public native void drawInContext(CGContextRef ctx);

	@Generated
	@Selector("drawsAsynchronously")
	public native boolean drawsAsynchronously();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("edgeAntialiasingMask")
	public native int edgeAntialiasingMask();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fillMode")
	public native String fillMode();

	@Generated
	@Selector("filters")
	public native NSArray filters();

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("hitTest:")
	public native CALayer hitTest(@ByValue CGPoint p);

	@Generated
	@Selector("init")
	public native CALayer init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithLayer:")
	public native CALayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	@Generated
	@Selector("insertSublayer:above:")
	public native void insertSublayerAbove(CALayer layer, CALayer sibling);

	@Generated
	@Selector("insertSublayer:atIndex:")
	public native void insertSublayerAtIndex(CALayer layer, int idx);

	@Generated
	@Selector("insertSublayer:below:")
	public native void insertSublayerBelow(CALayer layer, CALayer sibling);

	@Generated
	@Selector("isDoubleSided")
	public native boolean isDoubleSided();

	@Generated
	@Selector("isGeometryFlipped")
	public native boolean isGeometryFlipped();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("layer")
	public static native CALayer layer();

	@Generated
	@Selector("layoutIfNeeded")
	public native void layoutIfNeeded();

	@Generated
	@Selector("layoutManager")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object layoutManager();

	@Generated
	@Selector("layoutSublayers")
	public native void layoutSublayers();

	@Generated
	@Selector("magnificationFilter")
	public native String magnificationFilter();

	@Generated
	@Selector("mask")
	public native CALayer mask();

	@Generated
	@Selector("masksToBounds")
	public native boolean masksToBounds();

	@Generated
	@Selector("minificationFilter")
	public native String minificationFilter();

	@Generated
	@Selector("minificationFilterBias")
	public native float minificationFilterBias();

	@Generated
	@Selector("modelLayer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object modelLayer();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("needsDisplay")
	public native boolean needsDisplay();

	@Generated
	@Selector("needsDisplayForKey:")
	public static native boolean needsDisplayForKey(String key);

	@Generated
	@Selector("needsDisplayOnBoundsChange")
	public native boolean needsDisplayOnBoundsChange();

	@Generated
	@Selector("needsLayout")
	public native boolean needsLayout();

	@Generated
	@Selector("opacity")
	public native float opacity();

	@Generated
	@Selector("position")
	@ByValue
	public native CGPoint position();

	@Generated
	@Selector("preferredFrameSize")
	@ByValue
	public native CGSize preferredFrameSize();

	@Generated
	@Selector("presentationLayer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object presentationLayer();

	@Generated
	@Selector("rasterizationScale")
	public native double rasterizationScale();

	@Generated
	@Selector("removeAllAnimations")
	public native void removeAllAnimations();

	@Generated
	@Selector("removeAnimationForKey:")
	public native void removeAnimationForKey(String key);

	@Generated
	@Selector("removeFromSuperlayer")
	public native void removeFromSuperlayer();

	@Generated
	@Selector("renderInContext:")
	public native void renderInContext(CGContextRef ctx);

	@Generated
	@Selector("repeatCount")
	public native float repeatCount();

	@Generated
	@Selector("repeatDuration")
	public native double repeatDuration();

	@Generated
	@Selector("replaceSublayer:with:")
	public native void replaceSublayerWith(CALayer layer, CALayer layer2);

	@Generated
	@Selector("resizeSublayersWithOldSize:")
	public native void resizeSublayersWithOldSize(@ByValue CGSize size);

	@Generated
	@Selector("resizeWithOldSuperlayerSize:")
	public native void resizeWithOldSuperlayerSize(@ByValue CGSize size);

	@Generated
	@Selector("setActions:")
	public native void setActions(NSDictionary value);

	@Generated
	@Selector("setAffineTransform:")
	public native void setAffineTransform(@ByValue CGAffineTransform m);

	@Generated
	@Selector("setAnchorPoint:")
	public native void setAnchorPoint(@ByValue CGPoint value);

	@Generated
	@Selector("setAnchorPointZ:")
	public native void setAnchorPointZ(double value);

	@Generated
	@Selector("setAutoresizingMask:")
	public native void setAutoresizingMask(int value);

	@Generated
	@Selector("setAutoreverses:")
	public native void setAutoreverses(boolean value);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(CGColorRef value);

	@Generated
	@Selector("setBackgroundFilters:")
	public native void setBackgroundFilters(NSArray value);

	@Generated
	@Selector("setBeginTime:")
	public native void setBeginTime(double value);

	@Generated
	@Selector("setBorderColor:")
	public native void setBorderColor(CGColorRef value);

	@Generated
	@Selector("setBorderWidth:")
	public native void setBorderWidth(double value);

	@Generated
	@Selector("setBounds:")
	public native void setBounds(@ByValue CGRect value);

	@Generated
	@Selector("setCompositingFilter:")
	public native void setCompositingFilter(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setContents:")
	public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setContentsCenter:")
	public native void setContentsCenter(@ByValue CGRect value);

	@Generated
	@Selector("setContentsGravity:")
	public native void setContentsGravity(String value);

	@Generated
	@Selector("setContentsRect:")
	public native void setContentsRect(@ByValue CGRect value);

	@Generated
	@Selector("setContentsScale:")
	public native void setContentsScale(double value);

	@Generated
	@Selector("setCornerRadius:")
	public native void setCornerRadius(double value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setDoubleSided:")
	public native void setDoubleSided(boolean value);

	@Generated
	@Selector("setDrawsAsynchronously:")
	public native void setDrawsAsynchronously(boolean value);

	@Generated
	@Selector("setDuration:")
	public native void setDuration(double value);

	@Generated
	@Selector("setEdgeAntialiasingMask:")
	public native void setEdgeAntialiasingMask(int value);

	@Generated
	@Selector("setFillMode:")
	public native void setFillMode(String value);

	@Generated
	@Selector("setFilters:")
	public native void setFilters(NSArray value);

	@Generated
	@Selector("setFrame:")
	public native void setFrame(@ByValue CGRect value);

	@Generated
	@Selector("setGeometryFlipped:")
	public native void setGeometryFlipped(boolean value);

	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean value);

	@Generated
	@Selector("setLayoutManager:")
	public native void setLayoutManager(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setMagnificationFilter:")
	public native void setMagnificationFilter(String value);

	@Generated
	@Selector("setMask:")
	public native void setMask(CALayer value);

	@Generated
	@Selector("setMasksToBounds:")
	public native void setMasksToBounds(boolean value);

	@Generated
	@Selector("setMinificationFilter:")
	public native void setMinificationFilter(String value);

	@Generated
	@Selector("setMinificationFilterBias:")
	public native void setMinificationFilterBias(float value);

	@Generated
	@Selector("setName:")
	public native void setName(String value);

	@Generated
	@Selector("setNeedsDisplay")
	public native void setNeedsDisplay();

	@Generated
	@Selector("setNeedsDisplayInRect:")
	public native void setNeedsDisplayInRect(@ByValue CGRect r);

	@Generated
	@Selector("setNeedsDisplayOnBoundsChange:")
	public native void setNeedsDisplayOnBoundsChange(boolean value);

	@Generated
	@Selector("setNeedsLayout")
	public native void setNeedsLayout();

	@Generated
	@Selector("setOpacity:")
	public native void setOpacity(float value);

	@Generated
	@Selector("setOpaque:")
	public native void setOpaque(boolean value);

	@Generated
	@Selector("setPosition:")
	public native void setPosition(@ByValue CGPoint value);

	@Generated
	@Selector("setRasterizationScale:")
	public native void setRasterizationScale(double value);

	@Generated
	@Selector("setRepeatCount:")
	public native void setRepeatCount(float value);

	@Generated
	@Selector("setRepeatDuration:")
	public native void setRepeatDuration(double value);

	@Generated
	@Selector("setShadowColor:")
	public native void setShadowColor(CGColorRef value);

	@Generated
	@Selector("setShadowOffset:")
	public native void setShadowOffset(@ByValue CGSize value);

	@Generated
	@Selector("setShadowOpacity:")
	public native void setShadowOpacity(float value);

	@Generated
	@Selector("setShadowPath:")
	public native void setShadowPath(CGPathRef value);

	@Generated
	@Selector("setShadowRadius:")
	public native void setShadowRadius(double value);

	@Generated
	@Selector("setShouldRasterize:")
	public native void setShouldRasterize(boolean value);

	@Generated
	@Selector("setSpeed:")
	public native void setSpeed(float value);

	@Generated
	@Selector("setStyle:")
	public native void setStyle(NSDictionary value);

	@Generated
	@Selector("setSublayerTransform:")
	public native void setSublayerTransform(@ByValue CATransform3D value);

	@Generated
	@Selector("setSublayers:")
	public native void setSublayers(NSArray value);

	@Generated
	@Selector("setTimeOffset:")
	public native void setTimeOffset(double value);

	@Generated
	@Selector("setTransform:")
	public native void setTransform(@ByValue CATransform3D value);

	@Generated
	@Selector("setZPosition:")
	public native void setZPosition(double value);

	@Generated
	@Selector("shadowColor")
	public native CGColorRef shadowColor();

	@Generated
	@Selector("shadowOffset")
	@ByValue
	public native CGSize shadowOffset();

	@Generated
	@Selector("shadowOpacity")
	public native float shadowOpacity();

	@Generated
	@Selector("shadowPath")
	public native CGPathRef shadowPath();

	@Generated
	@Selector("shadowRadius")
	public native double shadowRadius();

	@Generated
	@Selector("shouldArchiveValueForKey:")
	public native boolean shouldArchiveValueForKey(String key);

	@Generated
	@Selector("shouldRasterize")
	public native boolean shouldRasterize();

	@Generated
	@Selector("speed")
	public native float speed();

	@Generated
	@Selector("style")
	public native NSDictionary style();

	@Generated
	@Selector("sublayerTransform")
	@ByValue
	public native CATransform3D sublayerTransform();

	@Generated
	@Selector("sublayers")
	public native NSArray sublayers();

	@Generated
	@Selector("superlayer")
	public native CALayer superlayer();

	@Generated
	@Selector("timeOffset")
	public native double timeOffset();

	@Generated
	@Selector("transform")
	@ByValue
	public native CATransform3D transform();

	@Generated
	@Selector("zPosition")
	public native double zPosition();
}
