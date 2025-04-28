package com.cloudframe.app.sf320010.dto;

/**
*  The class WaTimeHmsh is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaTimeHmsh extends WaTimeHmshSerialized {
   

						private char[] waTimeHh = Field.fillLowValue(2);

						private char[] waTimeMm = Field.fillLowValue(2);

						private char[] waTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for WaTimeHmsh
	**/
    public WaTimeHmsh() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of waTimeHh
	 *	@return waTimeHh
	 */
   public char[] getWaTimeHh() throws CFException{
     if (isWaTimeHhModified()) { 
        waTimeHh = refreshWaTimeHh();
     }
   		return waTimeHh;
   }

  
	/**
	*  set variable waTimeHh
	*  Corresponding COBOL Variable is WA-TIME-HH
	*  @param value
	**/
   public void setWaTimeHh(char[] value) {
      waTimeHh = checkWaTimeHhConstraints(value);
      serializeWaTimeHh(waTimeHh);
   } 

     /**
	 * 	Update WaTimeHh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeHh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeHh,waTimeHh.length);
   	
   }
   
   public void setWaTimeHh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHh,waTimeHh.length);
   	
   }
   
     /**
	 * 	Update WaTimeHh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeHh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeHh with another Field
	 *	@param value
	 */
   public void setWaTimeHh(Field source) {
       replace(source,0,source.length(),beginWaTimeHh,WA_TIME_HH_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeHh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeHh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeHh,WA_TIME_HH_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeHh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeHh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeHh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waTimeMm
	 *	@return waTimeMm
	 */
   public char[] getWaTimeMm() throws CFException{
     if (isWaTimeMmModified()) { 
        waTimeMm = refreshWaTimeMm();
     }
   		return waTimeMm;
   }

  
	/**
	*  set variable waTimeMm
	*  Corresponding COBOL Variable is WA-TIME-MM
	*  @param value
	**/
   public void setWaTimeMm(char[] value) {
      waTimeMm = checkWaTimeMmConstraints(value);
      serializeWaTimeMm(waTimeMm);
   } 

     /**
	 * 	Update WaTimeMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeMm,waTimeMm.length);
   	
   }
   
   public void setWaTimeMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMm,waTimeMm.length);
   	
   }
   
     /**
	 * 	Update WaTimeMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeMm with another Field
	 *	@param value
	 */
   public void setWaTimeMm(Field source) {
       replace(source,0,source.length(),beginWaTimeMm,WA_TIME_MM_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeMm,WA_TIME_MM_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waTimeSs
	 *	@return waTimeSs
	 */
   public char[] getWaTimeSs() throws CFException{
     if (isWaTimeSsModified()) { 
        waTimeSs = refreshWaTimeSs();
     }
   		return waTimeSs;
   }

  
	/**
	*  set variable waTimeSs
	*  Corresponding COBOL Variable is WA-TIME-SS
	*  @param value
	**/
   public void setWaTimeSs(char[] value) {
      waTimeSs = checkWaTimeSsConstraints(value);
      serializeWaTimeSs(waTimeSs);
   } 

     /**
	 * 	Update WaTimeSs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaTimeSs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaTimeSs,waTimeSs.length);
   	
   }
   
   public void setWaTimeSs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSs,waTimeSs.length);
   	
   }
   
     /**
	 * 	Update WaTimeSs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeSs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaTimeSs with another Field
	 *	@param value
	 */
   public void setWaTimeSs(Field source) {
       replace(source,0,source.length(),beginWaTimeSs,WA_TIME_SS_LEN);
   	
   }  
   
     /**
	 * 	Update WaTimeSs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaTimeSs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaTimeSs,WA_TIME_SS_LEN);
   	
   }
   
     /**
	 * 	Update WaTimeSs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaTimeSs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaTimeSs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWaTimeHmshFieldLength() {
			return WA_TIME_HMSH_LENGTH;
		}

}
  
