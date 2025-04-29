package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201SpaceParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip38201SpaceParms extends Ip38201SpaceParmsSerialized { 
   

						private char[] ip38201TrackCylinderInd = Field.fillLowValue(1);

								private long ip38201PrimarySpace;

								private long ip38201SecondarySpace;

						private char[] ip38201ReleaseIndicator = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip38201SpaceParms
	**/
    public Ip38201SpaceParms() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip38201SpaceParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201SpaceParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip38201TrackCylinderInd
	 *	@return ip38201TrackCylinderInd
	 */
   public char[] getIp38201TrackCylinderInd() throws CFException{
     if (isIp38201TrackCylinderIndModified()) { 
        ip38201TrackCylinderInd = refreshIp38201TrackCylinderInd();
     }
   		return ip38201TrackCylinderInd;
   }

  
	/**
	*  set variable ip38201TrackCylinderInd
	*  Corresponding COBOL Variable is IP38201-TRACK-CYLINDER-IND
	*  @param value
	**/
   public void setIp38201TrackCylinderInd(char[] value) {
      ip38201TrackCylinderInd = checkIp38201TrackCylinderIndConstraints(value);
      serializeIp38201TrackCylinderInd(ip38201TrackCylinderInd);
   } 

     /**
	 * 	Update Ip38201TrackCylinderInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201TrackCylinderInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201TrackCylinderInd,ip38201TrackCylinderInd.length);
   	
   }
   
   public void setIp38201TrackCylinderInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TrackCylinderInd,ip38201TrackCylinderInd.length);
   	
   }
   
     /**
	 * 	Update Ip38201TrackCylinderInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201TrackCylinderInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TrackCylinderInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201TrackCylinderInd with another Field
	 *	@param value
	 */
   public void setIp38201TrackCylinderInd(Field source) {
       replace(source,0,source.length(),beginIp38201TrackCylinderInd,IP_38201_TRACK_CYLINDER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201TrackCylinderInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201TrackCylinderInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201TrackCylinderInd,IP_38201_TRACK_CYLINDER_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201TrackCylinderInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201TrackCylinderInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201TrackCylinderInd+targetIndex,targetLen);
    
   }
	char[] ip38201SpaceInTracks8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp38201SpaceInTracks88()
	 *	@return  Returns true if isIp38201SpaceInTracks88() is "T"
	 */
   public boolean isIp38201SpaceInTracks88() throws CFException {
      return (  compareChars( getIp38201TrackCylinderInd() , ip38201SpaceInTracks8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp38201SpaceInTracks88True() {  			
    	setIp38201TrackCylinderInd( ip38201SpaceInTracks8888Value);
   	}
	char[] ip38201SpaceInCylinders8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp38201SpaceInCylinders88()
	 *	@return  Returns true if isIp38201SpaceInCylinders88() is "C"
	 */
   public boolean isIp38201SpaceInCylinders88() throws CFException {
      return (  compareChars( getIp38201TrackCylinderInd() , ip38201SpaceInCylinders8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp38201SpaceInCylinders88True() {  			
    	setIp38201TrackCylinderInd( ip38201SpaceInCylinders8888Value);
   	}
	char[] ip38201SpaceInBlkLngth8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp38201SpaceInBlkLngth88()
	 *	@return  Returns true if isIp38201SpaceInBlkLngth88() is "B"
	 */
   public boolean isIp38201SpaceInBlkLngth88() throws CFException {
      return (  compareChars( getIp38201TrackCylinderInd() , ip38201SpaceInBlkLngth8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp38201SpaceInBlkLngth88True() {  			
    	setIp38201TrackCylinderInd( ip38201SpaceInBlkLngth8888Value);
   	}
	char[] ip38201ValidTrackCylInd8888Value1 = "C".toCharArray();
char[] ip38201ValidTrackCylInd8888Value2 = "T".toCharArray();
char[] ip38201ValidTrackCylInd8888Value3 = "B".toCharArray();

	/**
	 *	Test condition "C" "T" "B" for isIp38201ValidTrackCylInd88()
	 *	@return  Returns true if isIp38201ValidTrackCylInd88() is "C" "T" "B"
	 */
   public boolean isIp38201ValidTrackCylInd88() throws CFException {
      return (  compareChars( getIp38201TrackCylinderInd() , ip38201ValidTrackCylInd8888Value1)  == 0  ||  compareChars( getIp38201TrackCylinderInd() , ip38201ValidTrackCylInd8888Value2)  == 0  ||  compareChars( getIp38201TrackCylinderInd() , ip38201ValidTrackCylInd8888Value3)  == 0  );
   }


	/**
	*  set values "C" "T" "B"
	*/
   	public void setIp38201ValidTrackCylInd88True() {  			
    	setIp38201TrackCylinderInd( ip38201ValidTrackCylInd8888Value1);
   	}
	/**
	 *	Returns the value of ip38201PrimarySpace
	 *	@return ip38201PrimarySpace
	 */
	public long getIp38201PrimarySpace() throws CFException {
       if (isIp38201PrimarySpaceModified()) { 
           ip38201PrimarySpace = refreshIp38201PrimarySpace();
        }
   		return ip38201PrimarySpace;
	}
	

	
	   
	/**
	 * 	Update Ip38201PrimarySpace with the passed value
	 *  Corresponding COBOL Variable is IP38201-PRIMARY-SPACE
	 *	@param number
	 */
	public void setIp38201PrimarySpace(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201PrimarySpace = checkIp38201PrimarySpaceMaxLimit(number); 
		serializeIp38201PrimarySpace(ip38201PrimarySpace);
	}
	

	/**
	 * 	Update Ip38201PrimarySpace with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201PrimarySpace(char[] value) throws CFException {
		 ip38201PrimarySpace = serializeIp38201PrimarySpace(value);
	}
	/**
	 * 	Update Ip38201PrimarySpace with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201PrimarySpaceString(char[] value) throws CFException {
		 setIp38201PrimarySpace(value);
	}
	/**
	 *	Returns the value of ip38201SecondarySpace
	 *	@return ip38201SecondarySpace
	 */
	public long getIp38201SecondarySpace() throws CFException {
       if (isIp38201SecondarySpaceModified()) { 
           ip38201SecondarySpace = refreshIp38201SecondarySpace();
        }
   		return ip38201SecondarySpace;
	}
	

	
	   
	/**
	 * 	Update Ip38201SecondarySpace with the passed value
	 *  Corresponding COBOL Variable is IP38201-SECONDARY-SPACE
	 *	@param number
	 */
	public void setIp38201SecondarySpace(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip38201SecondarySpace = checkIp38201SecondarySpaceMaxLimit(number); 
		serializeIp38201SecondarySpace(ip38201SecondarySpace);
	}
	

	/**
	 * 	Update Ip38201SecondarySpace with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp38201SecondarySpace(char[] value) throws CFException {
		 ip38201SecondarySpace = serializeIp38201SecondarySpace(value);
	}
	/**
	 * 	Update Ip38201SecondarySpace with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp38201SecondarySpaceString(char[] value) throws CFException {
		 setIp38201SecondarySpace(value);
	}
	/**
	 *	Returns the value of ip38201ReleaseIndicator
	 *	@return ip38201ReleaseIndicator
	 */
   public char[] getIp38201ReleaseIndicator() throws CFException{
     if (isIp38201ReleaseIndicatorModified()) { 
        ip38201ReleaseIndicator = refreshIp38201ReleaseIndicator();
     }
   		return ip38201ReleaseIndicator;
   }

  
	/**
	*  set variable ip38201ReleaseIndicator
	*  Corresponding COBOL Variable is IP38201-RELEASE-INDICATOR
	*  @param value
	**/
   public void setIp38201ReleaseIndicator(char[] value) {
      ip38201ReleaseIndicator = checkIp38201ReleaseIndicatorConstraints(value);
      serializeIp38201ReleaseIndicator(ip38201ReleaseIndicator);
   } 

     /**
	 * 	Update Ip38201ReleaseIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201ReleaseIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201ReleaseIndicator,ip38201ReleaseIndicator.length);
   	
   }
   
   public void setIp38201ReleaseIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReleaseIndicator,ip38201ReleaseIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip38201ReleaseIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ReleaseIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReleaseIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201ReleaseIndicator with another Field
	 *	@param value
	 */
   public void setIp38201ReleaseIndicator(Field source) {
       replace(source,0,source.length(),beginIp38201ReleaseIndicator,IP_38201_RELEASE_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201ReleaseIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201ReleaseIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201ReleaseIndicator,IP_38201_RELEASE_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201ReleaseIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ReleaseIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReleaseIndicator+targetIndex,targetLen);
    
   }
	char[] ip38201Release8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp38201Release88()
	 *	@return  Returns true if isIp38201Release88() is "R"
	 */
   public boolean isIp38201Release88() throws CFException {
      return (  compareChars( getIp38201ReleaseIndicator() , ip38201Release8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp38201Release88True() {  			
    	setIp38201ReleaseIndicator( ip38201Release8888Value);
   	}
	char[] ip38201DoNotRelease8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp38201DoNotRelease88()
	 *	@return  Returns true if isIp38201DoNotRelease88() is " "
	 */
   public boolean isIp38201DoNotRelease88() throws CFException {
      return (  compareChars( getIp38201ReleaseIndicator() , ip38201DoNotRelease8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201DoNotRelease88True() {  			
    	setIp38201ReleaseIndicator( ip38201DoNotRelease8888Value);
   	}
	char[] ip38201ValidReleaseInd8888Value1 = "R".toCharArray();
char[] ip38201ValidReleaseInd8888Value2 = " ".toCharArray();

	/**
	 *	Test condition "R" " " for isIp38201ValidReleaseInd88()
	 *	@return  Returns true if isIp38201ValidReleaseInd88() is "R" " "
	 */
   public boolean isIp38201ValidReleaseInd88() throws CFException {
      return (  compareChars( getIp38201ReleaseIndicator() , ip38201ValidReleaseInd8888Value1)  == 0  ||  compareChars( getIp38201ReleaseIndicator() , ip38201ValidReleaseInd8888Value2)  == 0  );
   }


	/**
	*  set values "R" " "
	*/
   	public void setIp38201ValidReleaseInd88True() {  			
    	setIp38201ReleaseIndicator( ip38201ValidReleaseInd8888Value1);
   	}

	
	
	
	/**
	 * 	initializes Ip38201SpaceParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201TrackCylinderInd(CONSTANTS.SPACE);
                     setIp38201PrimarySpace(0);
                     setIp38201SecondarySpace(0);
         setIp38201ReleaseIndicator(CONSTANTS.SPACE);
   }

		public static int getIp38201SpaceParmsFieldLength() {
			return IP_38201_SPACE_PARMS_LENGTH;
		}

}
  
