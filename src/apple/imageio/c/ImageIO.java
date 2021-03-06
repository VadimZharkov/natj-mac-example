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

package apple.imageio.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import apple.corefoundation.opaque.*;
import apple.coregraphics.opaque.CGDataConsumerRef;
import apple.coregraphics.opaque.CGDataProviderRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.imageio.opaque.CGImageDestinationRef;
import apple.imageio.opaque.CGImageSourceRef;

@Generated
@Library("ImageIO")
@Runtime(CRuntime.class)
public final class ImageIO {
	static {
		NatJ.register();
	}

	@Generated
	private ImageIO() {
	}

	@Generated
	@CFunction
	public static native long CGImageMetadataGetTypeID();

	@Generated
	@CFunction
	public static native long CGImageSourceGetTypeID();

	@Generated
	@CFunction
	public static native CFArrayRef CGImageSourceCopyTypeIdentifiers();

	@Generated
	@CFunction
	public static native CGImageSourceRef CGImageSourceCreateWithDataProvider(
			CGDataProviderRef provider, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageSourceRef CGImageSourceCreateWithData(
			CFDataRef data, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageSourceRef CGImageSourceCreateWithURL(
			CFURLRef url, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CFStringRef CGImageSourceGetType(CGImageSourceRef isrc);

	@Generated
	@CFunction
	public static native long CGImageSourceGetCount(CGImageSourceRef isrc);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGImageSourceCopyProperties(
			CGImageSourceRef isrc, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGImageSourceCopyPropertiesAtIndex(
			CGImageSourceRef isrc, long index, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageRef CGImageSourceCreateImageAtIndex(
			CGImageSourceRef isrc, long index, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native void CGImageSourceRemoveCacheAtIndex(
			CGImageSourceRef isrc, long index);

	@Generated
	@CFunction
	public static native CGImageRef CGImageSourceCreateThumbnailAtIndex(
			CGImageSourceRef isrc, long index, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageSourceRef CGImageSourceCreateIncremental(
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native void CGImageSourceUpdateData(CGImageSourceRef isrc,
			CFDataRef data, boolean final_);

	@Generated
	@CFunction
	public static native void CGImageSourceUpdateDataProvider(
			CGImageSourceRef isrc, CGDataProviderRef provider, boolean final_);

	@Generated
	@CFunction
	public static native int CGImageSourceGetStatus(CGImageSourceRef isrc);

	@Generated
	@CFunction
	public static native int CGImageSourceGetStatusAtIndex(
			CGImageSourceRef isrc, long index);

	@Generated
	@CFunction
	public static native long CGImageDestinationGetTypeID();

	@Generated
	@CFunction
	public static native CFArrayRef CGImageDestinationCopyTypeIdentifiers();

	@Generated
	@CFunction
	public static native CGImageDestinationRef CGImageDestinationCreateWithDataConsumer(
			CGDataConsumerRef consumer, CFStringRef type, long count,
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageDestinationRef CGImageDestinationCreateWithData(
			CFMutableDataRef data, CFStringRef type, long count,
			CFDictionaryRef options);

	@Generated
	@CFunction
	public static native CGImageDestinationRef CGImageDestinationCreateWithURL(
			CFURLRef url, CFStringRef type, long count, CFDictionaryRef options);

	@Generated
	@CFunction
	public static native void CGImageDestinationSetProperties(
			CGImageDestinationRef idst, CFDictionaryRef properties);

	@Generated
	@CFunction
	public static native void CGImageDestinationAddImage(
			CGImageDestinationRef idst, CGImageRef image,
			CFDictionaryRef properties);

	@Generated
	@CFunction
	public static native void CGImageDestinationAddImageFromSource(
			CGImageDestinationRef idst, CGImageSourceRef isrc, long index,
			CFDictionaryRef properties);

	@Generated
	@CFunction
	public static native boolean CGImageDestinationFinalize(
			CGImageDestinationRef idst);

	@Generated
	@CVariable()
	public static native CFStringRef kCFErrorDomainCGImageMetadata();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceTypeIdentifierHint();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceShouldCache();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceShouldCacheImmediately();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceShouldAllowFloat();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceCreateThumbnailFromImageIfAbsent();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceCreateThumbnailFromImageAlways();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceThumbnailMaxPixelSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageSourceCreateThumbnailWithTransform();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageDestinationLossyCompressionQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageDestinationBackgroundColor();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyRawDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerMinoltaDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerFujiDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerOlympusDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerPentaxDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageProperty8BIMDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxDictionary();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyFileSize();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPixelHeight();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPixelWidth();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDPIHeight();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDPIWidth();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDepth();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyOrientation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIsFloat();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIsIndexed();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyHasAlpha();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyColorModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyProfileName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyColorModelRGB();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyColorModelGray();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyColorModelCMYK();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyColorModelLab();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFCompression();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFPhotometricInterpretation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFDocumentName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFImageDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFMake();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFOrientation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFXResolution();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFYResolution();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFResolutionUnit();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFSoftware();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFTransferFunction();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFDateTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFArtist();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFHostComputer();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFCopyright();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFWhitePoint();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyTIFFPrimaryChromaticities();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFXDensity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFYDensity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFDensityUnit();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyJFIFIsProgressive();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifExposureTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifExposureProgram();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSpectralSensitivity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifISOSpeedRatings();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifOECF();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifDateTimeOriginal();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifDateTimeDigitized();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifComponentsConfiguration();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifCompressedBitsPerPixel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifShutterSpeedValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifApertureValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifBrightnessValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifExposureBiasValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifMaxApertureValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubjectDistance();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifMeteringMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifLightSource();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFlash();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFocalLength();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubjectArea();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifMakerNote();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifUserComment();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubsecTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubsecTimeOrginal();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubsecTimeDigitized();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFlashPixVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifColorSpace();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifPixelXDimension();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifPixelYDimension();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifRelatedSoundFile();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFlashEnergy();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSpatialFrequencyResponse();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFocalPlaneXResolution();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFocalPlaneYResolution();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFocalPlaneResolutionUnit();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubjectLocation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifExposureIndex();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSensingMethod();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFileSource();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSceneType();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifCFAPattern();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifCustomRendered();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifExposureMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifWhiteBalance();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifDigitalZoomRatio();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifFocalLenIn35mmFilm();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSceneCaptureType();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifGainControl();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifContrast();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSaturation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSharpness();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifDeviceSettingDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifSubjectDistRange();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifImageUniqueID();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifCameraOwnerName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifBodySerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifLensSpecification();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifLensMake();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifLensModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifLensSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifGamma();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxLensInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxLensModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxLensID();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxLensSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxImageNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxFlashCompensation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxOwnerName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyExifAuxFirmware();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFLoopCount();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFDelayTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFImageColorMap();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFHasGlobalColorMap();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGIFUnclampedDelayTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGGamma();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGInterlaceType();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGXPixelsPerMeter();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGYPixelsPerMeter();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGsRGBIntent();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGChromaticities();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGAuthor();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGCopyright();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGCreationTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGModificationTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGSoftware();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyPNGTitle();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSLatitudeRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSLatitude();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSLongitudeRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSLongitude();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSAltitudeRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSAltitude();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSTimeStamp();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSSatellites();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSStatus();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSMeasureMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDOP();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSSpeedRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSSpeed();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSTrackRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSTrack();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSImgDirectionRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSImgDirection();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSMapDatum();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestLatitudeRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestLatitude();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestLongitudeRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestLongitude();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestBearingRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestBearing();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestDistanceRef();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDestDistance();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSProcessingMethod();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSAreaInformation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDateStamp();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyGPSDifferental();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCObjectTypeReference();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCObjectAttributeReference();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCObjectName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCEditStatus();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCEditorialUpdate();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCUrgency();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCSubjectReference();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCategory();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCSupplementalCategory();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCFixtureIdentifier();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCKeywords();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContentLocationCode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContentLocationName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCReleaseDate();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCReleaseTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCExpirationDate();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCExpirationTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCSpecialInstructions();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCActionAdvised();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCReferenceService();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCReferenceDate();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCReferenceNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCDateCreated();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCTimeCreated();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCDigitalCreationDate();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCDigitalCreationTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCOriginatingProgram();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCProgramVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCObjectCycle();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCByline();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCBylineTitle();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCSubLocation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCProvinceState();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationCode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCountryPrimaryLocationName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCOriginalTransmissionReference();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCHeadline();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCredit();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCSource();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCopyrightNotice();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContact();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCaptionAbstract();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCWriterEditor();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCImageType();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCImageOrientation();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCLanguageIdentifier();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCStarRating();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCCreatorContactInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCRightsUsageTerms();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCScene();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoCity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoCountry();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoAddress();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoPostalCode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoStateProvince();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoEmails();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoPhones();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyIPTCContactInfoWebURLs();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImageProperty8BIMLayerNames();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGBackwardVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGUniqueCameraModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGLocalizedCameraModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGCameraSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyDNGLensInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFDescription();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFFirmware();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFOwnerName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFImageName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFImageFileName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFReleaseMethod();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFReleaseTiming();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFRecordID();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFSelfTimingTime();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFCameraSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFImageSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFContinuousDrive();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFFocusMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFMeteringMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFShootingMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFLensModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFLensMaxMM();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFLensMinMM();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFWhiteBalanceIndex();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFFlashExposureComp();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyCIFFMeasuredEV();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonISOSetting();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonColorMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonQuality();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonWhiteBalanceMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonSharpenMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonFocusMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonFlashSetting();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonISOSelection();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonFlashExposureComp();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonImageAdjustment();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonLensAdapter();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonLensType();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonLensInfo();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonFocusDistance();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonDigitalZoom();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonShootingMode();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonCameraSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerNikonShutterCount();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonOwnerName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonCameraSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonImageSerialNumber();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonFlashExposureComp();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonContinuousDrive();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonLensModel();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonFirmware();

	@Generated
	@CVariable()
	public static native CFStringRef kCGImagePropertyMakerCanonAspectRatioInfo();
}
