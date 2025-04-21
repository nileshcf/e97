package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln9 extends DtPage2Ln9Serialized {
   

						private char[] dt29Cc = new char[1];



								private char[] dt29SurchgNbr = Field.fillLowValue(15);







	
	/**
	* Constructor for DtPage2Ln9
	**/
    public DtPage2Ln9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt29Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SURCHARGE FREE            ").toCharArray()
             , getStartOffset() + 2
             ,26
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 43
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 48
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 63
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 67
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 82
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 87
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }


 

	/**
	 *	Returns the value of dt29Cc
	 *	@return dt29Cc
	 */
   public char[] getDt29Cc() throws CFException{
     if (isDt29CcModified()) { 
        dt29Cc = refreshDt29Cc();
     }
   		return dt29Cc;
   }

  
	/**
	*  set variable dt29Cc
	*  Corresponding COBOL Variable is DT2-9-CC
	*  @param value
	**/
   public void setDt29Cc(char[] value) {
      dt29Cc = checkDt29CcConstraints(value);
      serializeDt29Cc(dt29Cc);
   } 

     /**
	 * 	Update Dt29Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt29Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt29Cc,dt29Cc.length);
   	
   }
   
   public void setDt29Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt29Cc,dt29Cc.length);
   	
   }
   
     /**
	 * 	Update Dt29Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt29Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt29Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt29Cc with another Field
	 *	@param value
	 */
   public void setDt29Cc(Field source) {
       replace(source,0,source.length(),beginDt29Cc,DT_29_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt29Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt29Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt29Cc,DT_29_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt29Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt29Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt29Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt29SurchgNbr
	 *	@return dt29SurchgNbr
	 */
   public char[] getDt29SurchgNbr() throws CFException{
     if (isDt29SurchgNbrModified()) { 
        dt29SurchgNbr = refreshDt29SurchgNbr();
     }
   		return dt29SurchgNbr;
   }

  
	/**
	*  set variable dt29SurchgNbr
	*  Corresponding COBOL Variable is DT2-9-SURCHG-NBR
	*  @param value
	**/
   public void setDt29SurchgNbr(char[] value) {
      dt29SurchgNbr = checkDt29SurchgNbrConstraints(value);
      serializeDt29SurchgNbr(dt29SurchgNbr);
   } 

     /**
	 * 	Update Dt29SurchgNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt29SurchgNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt29SurchgNbr,dt29SurchgNbr.length);
   	
   }
   
   public void setDt29SurchgNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt29SurchgNbr,dt29SurchgNbr.length);
   	
   }
   
     /**
	 * 	Update Dt29SurchgNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt29SurchgNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt29SurchgNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt29SurchgNbr with another Field
	 *	@param value
	 */
   public void setDt29SurchgNbr(Field source) {
       replace(source,0,source.length(),beginDt29SurchgNbr,DT_29_SURCHG_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt29SurchgNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt29SurchgNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt29SurchgNbr,DT_29_SURCHG_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt29SurchgNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt29SurchgNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt29SurchgNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln9FieldLength() {
			return DT_PAGE_2_LN_9_LENGTH;
		}

}
  
