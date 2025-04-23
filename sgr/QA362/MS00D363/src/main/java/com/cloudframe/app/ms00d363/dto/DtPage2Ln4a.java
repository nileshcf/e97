package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln4a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln4a extends DtPage2Ln4aSerialized {
   

						private char[] dt24aCc = new char[1];



								private char[] dt24aNsdDbNbr = Field.fillLowValue(12);


								private char[] dt24aNsdCrNbr = Field.fillLowValue(12);

	
	/**
	* Constructor for DtPage2Ln4a
	**/
    public DtPage2Ln4a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt24aCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("NON-SAME DAY,NON-FINANCIAL ").toCharArray()
             , getStartOffset() + 4
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 43
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(55)
             , getStartOffset() + 82
             ,55
             );
    }


 

	/**
	 *	Returns the value of dt24aCc
	 *	@return dt24aCc
	 */
   public char[] getDt24aCc() throws CFException{
     if (isDt24aCcModified()) { 
        dt24aCc = refreshDt24aCc();
     }
   		return dt24aCc;
   }

  
	/**
	*  set variable dt24aCc
	*  Corresponding COBOL Variable is DT2-4A-CC
	*  @param value
	**/
   public void setDt24aCc(char[] value) {
      dt24aCc = checkDt24aCcConstraints(value);
      serializeDt24aCc(dt24aCc);
   } 

     /**
	 * 	Update Dt24aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24aCc,dt24aCc.length);
   	
   }
   
   public void setDt24aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aCc,dt24aCc.length);
   	
   }
   
     /**
	 * 	Update Dt24aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24aCc with another Field
	 *	@param value
	 */
   public void setDt24aCc(Field source) {
       replace(source,0,source.length(),beginDt24aCc,DT_24A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24aCc,DT_24A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt24aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24aNsdDbNbr
	 *	@return dt24aNsdDbNbr
	 */
   public char[] getDt24aNsdDbNbr() throws CFException{
     if (isDt24aNsdDbNbrModified()) { 
        dt24aNsdDbNbr = refreshDt24aNsdDbNbr();
     }
   		return dt24aNsdDbNbr;
   }

  
	/**
	*  set variable dt24aNsdDbNbr
	*  Corresponding COBOL Variable is DT2-4A-NSD-DB-NBR
	*  @param value
	**/
   public void setDt24aNsdDbNbr(char[] value) {
      dt24aNsdDbNbr = checkDt24aNsdDbNbrConstraints(value);
      serializeDt24aNsdDbNbr(dt24aNsdDbNbr);
   } 

     /**
	 * 	Update Dt24aNsdDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24aNsdDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24aNsdDbNbr,dt24aNsdDbNbr.length);
   	
   }
   
   public void setDt24aNsdDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdDbNbr,dt24aNsdDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt24aNsdDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24aNsdDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24aNsdDbNbr with another Field
	 *	@param value
	 */
   public void setDt24aNsdDbNbr(Field source) {
       replace(source,0,source.length(),beginDt24aNsdDbNbr,DT_24A_NSD_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24aNsdDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24aNsdDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24aNsdDbNbr,DT_24A_NSD_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt24aNsdDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24aNsdDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24aNsdCrNbr
	 *	@return dt24aNsdCrNbr
	 */
   public char[] getDt24aNsdCrNbr() throws CFException{
     if (isDt24aNsdCrNbrModified()) { 
        dt24aNsdCrNbr = refreshDt24aNsdCrNbr();
     }
   		return dt24aNsdCrNbr;
   }

  
	/**
	*  set variable dt24aNsdCrNbr
	*  Corresponding COBOL Variable is DT2-4A-NSD-CR-NBR
	*  @param value
	**/
   public void setDt24aNsdCrNbr(char[] value) {
      dt24aNsdCrNbr = checkDt24aNsdCrNbrConstraints(value);
      serializeDt24aNsdCrNbr(dt24aNsdCrNbr);
   } 

     /**
	 * 	Update Dt24aNsdCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24aNsdCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24aNsdCrNbr,dt24aNsdCrNbr.length);
   	
   }
   
   public void setDt24aNsdCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdCrNbr,dt24aNsdCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt24aNsdCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24aNsdCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24aNsdCrNbr with another Field
	 *	@param value
	 */
   public void setDt24aNsdCrNbr(Field source) {
       replace(source,0,source.length(),beginDt24aNsdCrNbr,DT_24A_NSD_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24aNsdCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24aNsdCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24aNsdCrNbr,DT_24A_NSD_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt24aNsdCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24aNsdCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24aNsdCrNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln4aFieldLength() {
			return DT_PAGE_2_LN_4A_LENGTH;
		}

}
  
