package com.cloudframe.app.ip343900.file.records;

/**
*  The class Sys001PimLoadRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip343900.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001PimLoadRec extends Sys001PimLoadRecSerialized { 
   

						private char[] sys001StatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001PimLoadRec
	**/
    public Sys001PimLoadRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001StatCd
	 *	@return sys001StatCd
	 */
   public char[] getSys001StatCd() throws CFException{
     if (isSys001StatCdModified()) { 
        sys001StatCd = refreshSys001StatCd();
     }
   		return sys001StatCd;
   }

  
	/**
	*  set variable sys001StatCd
	*  Corresponding COBOL Variable is SYS001-STAT-CD
	*  @param value
	**/
   public void setSys001StatCd(char[] value) {
      sys001StatCd = checkSys001StatCdConstraints(value);
      serializeSys001StatCd(sys001StatCd);
   } 

     /**
	 * 	Update Sys001StatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001StatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001StatCd,sys001StatCd.length);
   	
   }
   
   public void setSys001StatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001StatCd,sys001StatCd.length);
   	
   }
   
     /**
	 * 	Update Sys001StatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001StatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001StatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001StatCd with another Field
	 *	@param value
	 */
   public void setSys001StatCd(Field source) {
       replace(source,0,source.length(),beginSys001StatCd,SYS_001_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001StatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001StatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001StatCd,SYS_001_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Sys001StatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001StatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001StatCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001PimLoadRecFieldLength() {
			return SYS_001_PIM_LOAD_REC_LENGTH;
		}

}
  
