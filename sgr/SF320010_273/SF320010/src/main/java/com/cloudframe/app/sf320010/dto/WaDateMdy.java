package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDateMdy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaDateMdy extends WaDateMdySerialized {
   

						private char[] waDateMn = Field.fillLowValue(2);

						private char[] waDateDy = Field.fillLowValue(2);

						private char[] waDateYr = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDateMdy
	**/
    public WaDateMdy() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of waDateMn
	 *	@return waDateMn
	 */
   public char[] getWaDateMn() throws CFException{
     if (isWaDateMnModified()) { 
        waDateMn = refreshWaDateMn();
     }
   		return waDateMn;
   }

  
	/**
	*  set variable waDateMn
	*  Corresponding COBOL Variable is WA-DATE-MN
	*  @param value
	**/
   public void setWaDateMn(char[] value) {
      waDateMn = checkWaDateMnConstraints(value);
      serializeWaDateMn(waDateMn);
   } 

     /**
	 * 	Update WaDateMn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateMn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateMn,waDateMn.length);
   	
   }
   
   public void setWaDateMn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMn,waDateMn.length);
   	
   }
   
     /**
	 * 	Update WaDateMn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateMn with another Field
	 *	@param value
	 */
   public void setWaDateMn(Field source) {
       replace(source,0,source.length(),beginWaDateMn,WA_DATE_MN_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateMn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateMn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateMn,WA_DATE_MN_LEN);
   	
   }
   
     /**
	 * 	Update WaDateMn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateMn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateMn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateDy
	 *	@return waDateDy
	 */
   public char[] getWaDateDy() throws CFException{
     if (isWaDateDyModified()) { 
        waDateDy = refreshWaDateDy();
     }
   		return waDateDy;
   }

  
	/**
	*  set variable waDateDy
	*  Corresponding COBOL Variable is WA-DATE-DY
	*  @param value
	**/
   public void setWaDateDy(char[] value) {
      waDateDy = checkWaDateDyConstraints(value);
      serializeWaDateDy(waDateDy);
   } 

     /**
	 * 	Update WaDateDy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateDy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateDy,waDateDy.length);
   	
   }
   
   public void setWaDateDy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDy,waDateDy.length);
   	
   }
   
     /**
	 * 	Update WaDateDy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateDy with another Field
	 *	@param value
	 */
   public void setWaDateDy(Field source) {
       replace(source,0,source.length(),beginWaDateDy,WA_DATE_DY_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateDy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateDy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateDy,WA_DATE_DY_LEN);
   	
   }
   
     /**
	 * 	Update WaDateDy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateDy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateDy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waDateYr
	 *	@return waDateYr
	 */
   public char[] getWaDateYr() throws CFException{
     if (isWaDateYrModified()) { 
        waDateYr = refreshWaDateYr();
     }
   		return waDateYr;
   }

  
	/**
	*  set variable waDateYr
	*  Corresponding COBOL Variable is WA-DATE-YR
	*  @param value
	**/
   public void setWaDateYr(char[] value) {
      waDateYr = checkWaDateYrConstraints(value);
      serializeWaDateYr(waDateYr);
   } 

     /**
	 * 	Update WaDateYr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaDateYr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaDateYr,waDateYr.length);
   	
   }
   
   public void setWaDateYr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYr,waDateYr.length);
   	
   }
   
     /**
	 * 	Update WaDateYr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaDateYr with another Field
	 *	@param value
	 */
   public void setWaDateYr(Field source) {
       replace(source,0,source.length(),beginWaDateYr,WA_DATE_YR_LEN);
   	
   }  
   
     /**
	 * 	Update WaDateYr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaDateYr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaDateYr,WA_DATE_YR_LEN);
   	
   }
   
     /**
	 * 	Update WaDateYr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaDateYr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaDateYr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaDateMdyFieldLength() {
			return WA_DATE_MDY_LENGTH;
		}

}
  
