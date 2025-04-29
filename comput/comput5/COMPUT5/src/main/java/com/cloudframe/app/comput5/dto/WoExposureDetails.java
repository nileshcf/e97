package com.cloudframe.app.comput5.dto;

/**
*  The class WoExposureDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WoExposureDetails extends WoExposureDetailsSerialized { 
   


						private char[] woExposure = Field.fillLowValue(9);

								private char[] woExposureS = Field.fillLowValue(9);
	
	/**
	* Constructor for WoExposureDetails
	**/
    public WoExposureDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WoExposureDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WoExposureDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 0
             ,1
             );
    } 

	/**
	 *	Returns the value of woExposure
	 *	@return woExposure
	 */
   public char[] getWoExposure() throws CFException{
     if (isWoExposureModified()) { 
        woExposure = refreshWoExposure();
     }
   		return woExposure;
   }

  
	/**
	*  set variable woExposure
	*  Corresponding COBOL Variable is WO-EXPOSURE
	*  @param value
	**/
   public void setWoExposure(char[] value) {
      woExposure = checkWoExposureConstraints(value);
      serializeWoExposure(woExposure);
   } 

     /**
	 * 	Update WoExposure 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWoExposure(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWoExposure,woExposure.length);
   	
   }
   
   public void setWoExposure(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposure,woExposure.length);
   	
   }
   
     /**
	 * 	Update WoExposure 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWoExposure(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposure+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WoExposure with another Field
	 *	@param value
	 */
   public void setWoExposure(Field source) {
       replace(source,0,source.length(),beginWoExposure,WO_EXPOSURE_LEN);
   	
   }  
   
     /**
	 * 	Update WoExposure 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWoExposure(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWoExposure,WO_EXPOSURE_LEN);
   	
   }
   
     /**
	 * 	Update WoExposure 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWoExposure(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposure+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of woExposureS
	 *	@return woExposureS
	 */
   public char[] getWoExposureS() throws CFException{
     if (isWoExposureSModified()) { 
        woExposureS = refreshWoExposureS();
     }
   		return woExposureS;
   }

  
	/**
	*  set variable woExposureS
	*  Corresponding COBOL Variable is WO-EXPOSURE-S
	*  @param value
	**/
   public void setWoExposureS(char[] value) {
      woExposureS = checkWoExposureSConstraints(value);
      serializeWoExposureS(woExposureS);
   } 

     /**
	 * 	Update WoExposureS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWoExposureS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWoExposureS,woExposureS.length);
   	
   }
   
   public void setWoExposureS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposureS,woExposureS.length);
   	
   }
   
     /**
	 * 	Update WoExposureS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWoExposureS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposureS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WoExposureS with another Field
	 *	@param value
	 */
   public void setWoExposureS(Field source) {
       replace(source,0,source.length(),beginWoExposureS,WO_EXPOSURE_S_LEN);
   	
   }  
   
     /**
	 * 	Update WoExposureS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWoExposureS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWoExposureS,WO_EXPOSURE_S_LEN);
   	
   }
   
     /**
	 * 	Update WoExposureS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWoExposureS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWoExposureS+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWoExposureDetailsFieldLength() {
			return WO_EXPOSURE_DETAILS_LENGTH;
		}

}
  
