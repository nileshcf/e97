package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl91DfltBsl1Msg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl91DfltBsl1Msg600 extends Tbl91DfltBsl1Msg600Serialized {
   


								private char[] bsl1BuildCount60091 = new char[10];
							
	
	/**
	* Constructor for Tbl91DfltBsl1Msg600
	**/
    public Tbl91DfltBsl1Msg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE91 DEFAULT INTERREGIONAL RECORDS BUILD:").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setBsl1BuildCount60091(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of bsl1BuildCount60091
	 *	@return bsl1BuildCount60091
	 */
   public char[] getBsl1BuildCount60091() throws CFException{
     if (isBsl1BuildCount60091Modified()) { 
        bsl1BuildCount60091 = refreshBsl1BuildCount60091();
     }
   		return bsl1BuildCount60091;
   }

  
	/**
	*  set variable bsl1BuildCount60091
	*  Corresponding COBOL Variable is 600-91BSL-1-BUILD-COUNT
	*  @param value
	**/
   public void setBsl1BuildCount60091(char[] value) {
      bsl1BuildCount60091 = checkBsl1BuildCount60091Constraints(value);
      serializeBsl1BuildCount60091(bsl1BuildCount60091);
   } 

     /**
	 * 	Update Bsl1BuildCount60091 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl1BuildCount60091(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsl1BuildCount60091,bsl1BuildCount60091.length);
   	
   }
   
   public void setBsl1BuildCount60091(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsl1BuildCount60091,bsl1BuildCount60091.length);
   	
   }
   
     /**
	 * 	Update Bsl1BuildCount60091 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl1BuildCount60091(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl1BuildCount60091+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsl1BuildCount60091 with another Field
	 *	@param value
	 */
   public void setBsl1BuildCount60091(Field source) {
       replace(source,0,source.length(),beginBsl1BuildCount60091,BSL_1_BUILD_COUNT_60091_LEN);
   	
   }  
   
     /**
	 * 	Update Bsl1BuildCount60091 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl1BuildCount60091(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsl1BuildCount60091,BSL_1_BUILD_COUNT_60091_LEN);
   	
   }
   
     /**
	 * 	Update Bsl1BuildCount60091 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl1BuildCount60091(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl1BuildCount60091+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl91DfltBsl1Msg600FieldLength() {
			return TBL_91_DFLT_BSL_1_MSG_600_LENGTH;
		}

}
  
