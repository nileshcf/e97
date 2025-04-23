package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdOptExpMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsdOptExpMmddccyy extends MsdOptExpMmddccyySerialized { 
   

						private char[] msdOptExpMm = Field.fillLowValue(2);

						private char[] msdOptExpDd = Field.fillLowValue(2);

						private char[] msdOptExpCc = Field.fillLowValue(2);

						private char[] msdOptExpYy = Field.fillLowValue(2);
	
	/**
	* Constructor for MsdOptExpMmddccyy
	**/
    public MsdOptExpMmddccyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdOptExpMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOptExpMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdOptExpMm
	 *	@return msdOptExpMm
	 */
   public char[] getMsdOptExpMm() throws CFException{
     if (isMsdOptExpMmModified()) { 
        msdOptExpMm = refreshMsdOptExpMm();
     }
   		return msdOptExpMm;
   }

  
	/**
	*  set variable msdOptExpMm
	*  Corresponding COBOL Variable is MSD-OPT-EXP-MM
	*  @param value
	**/
   public void setMsdOptExpMm(char[] value) {
      msdOptExpMm = checkMsdOptExpMmConstraints(value);
      serializeMsdOptExpMm(msdOptExpMm);
   } 

     /**
	 * 	Update MsdOptExpMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdOptExpMm,msdOptExpMm.length);
   	
   }
   
   public void setMsdOptExpMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpMm,msdOptExpMm.length);
   	
   }
   
     /**
	 * 	Update MsdOptExpMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdOptExpMm with another Field
	 *	@param value
	 */
   public void setMsdOptExpMm(Field source) {
       replace(source,0,source.length(),beginMsdOptExpMm,MSD_OPT_EXP_MM_LEN);
   	
   }  
   
     /**
	 * 	Update MsdOptExpMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdOptExpMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdOptExpMm,MSD_OPT_EXP_MM_LEN);
   	
   }
   
     /**
	 * 	Update MsdOptExpMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdOptExpDd
	 *	@return msdOptExpDd
	 */
   public char[] getMsdOptExpDd() throws CFException{
     if (isMsdOptExpDdModified()) { 
        msdOptExpDd = refreshMsdOptExpDd();
     }
   		return msdOptExpDd;
   }

  
	/**
	*  set variable msdOptExpDd
	*  Corresponding COBOL Variable is MSD-OPT-EXP-DD
	*  @param value
	**/
   public void setMsdOptExpDd(char[] value) {
      msdOptExpDd = checkMsdOptExpDdConstraints(value);
      serializeMsdOptExpDd(msdOptExpDd);
   } 

     /**
	 * 	Update MsdOptExpDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdOptExpDd,msdOptExpDd.length);
   	
   }
   
   public void setMsdOptExpDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpDd,msdOptExpDd.length);
   	
   }
   
     /**
	 * 	Update MsdOptExpDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdOptExpDd with another Field
	 *	@param value
	 */
   public void setMsdOptExpDd(Field source) {
       replace(source,0,source.length(),beginMsdOptExpDd,MSD_OPT_EXP_DD_LEN);
   	
   }  
   
     /**
	 * 	Update MsdOptExpDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdOptExpDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdOptExpDd,MSD_OPT_EXP_DD_LEN);
   	
   }
   
     /**
	 * 	Update MsdOptExpDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdOptExpCc
	 *	@return msdOptExpCc
	 */
   public char[] getMsdOptExpCc() throws CFException{
     if (isMsdOptExpCcModified()) { 
        msdOptExpCc = refreshMsdOptExpCc();
     }
   		return msdOptExpCc;
   }

  
	/**
	*  set variable msdOptExpCc
	*  Corresponding COBOL Variable is MSD-OPT-EXP-CC
	*  @param value
	**/
   public void setMsdOptExpCc(char[] value) {
      msdOptExpCc = checkMsdOptExpCcConstraints(value);
      serializeMsdOptExpCc(msdOptExpCc);
   } 

     /**
	 * 	Update MsdOptExpCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdOptExpCc,msdOptExpCc.length);
   	
   }
   
   public void setMsdOptExpCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpCc,msdOptExpCc.length);
   	
   }
   
     /**
	 * 	Update MsdOptExpCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdOptExpCc with another Field
	 *	@param value
	 */
   public void setMsdOptExpCc(Field source) {
       replace(source,0,source.length(),beginMsdOptExpCc,MSD_OPT_EXP_CC_LEN);
   	
   }  
   
     /**
	 * 	Update MsdOptExpCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdOptExpCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdOptExpCc,MSD_OPT_EXP_CC_LEN);
   	
   }
   
     /**
	 * 	Update MsdOptExpCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdOptExpYy
	 *	@return msdOptExpYy
	 */
   public char[] getMsdOptExpYy() throws CFException{
     if (isMsdOptExpYyModified()) { 
        msdOptExpYy = refreshMsdOptExpYy();
     }
   		return msdOptExpYy;
   }

  
	/**
	*  set variable msdOptExpYy
	*  Corresponding COBOL Variable is MSD-OPT-EXP-YY
	*  @param value
	**/
   public void setMsdOptExpYy(char[] value) {
      msdOptExpYy = checkMsdOptExpYyConstraints(value);
      serializeMsdOptExpYy(msdOptExpYy);
   } 

     /**
	 * 	Update MsdOptExpYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpYy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdOptExpYy,msdOptExpYy.length);
   	
   }
   
   public void setMsdOptExpYy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpYy,msdOptExpYy.length);
   	
   }
   
     /**
	 * 	Update MsdOptExpYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpYy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdOptExpYy with another Field
	 *	@param value
	 */
   public void setMsdOptExpYy(Field source) {
       replace(source,0,source.length(),beginMsdOptExpYy,MSD_OPT_EXP_YY_LEN);
   	
   }  
   
     /**
	 * 	Update MsdOptExpYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdOptExpYy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdOptExpYy,MSD_OPT_EXP_YY_LEN);
   	
   }
   
     /**
	 * 	Update MsdOptExpYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdOptExpYy+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MsdOptExpMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdOptExpMm(CONSTANTS.SPACE_2);
         setMsdOptExpDd(CONSTANTS.SPACE_2);
         setMsdOptExpCc(CONSTANTS.SPACE_2);
         setMsdOptExpYy(CONSTANTS.SPACE_2);
   }

		public static int getMsdOptExpMmddccyyFieldLength() {
			return MSD_OPT_EXP_MMDDCCYY_LENGTH;
		}

}
  
