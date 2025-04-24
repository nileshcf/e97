package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl91DfltBsl2Msg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl91DfltBsl2Msg600 extends Tbl91DfltBsl2Msg600Serialized { 
   


								private char[] bsl2BuildCount60091 = new char[10];
							
	
	/**
	* Constructor for Tbl91DfltBsl2Msg600
	**/
    public Tbl91DfltBsl2Msg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE91 DEFAULT INTRAREGIONAL RECORDS BUILD:").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setBsl2BuildCount60091(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of bsl2BuildCount60091
	 *	@return bsl2BuildCount60091
	 */
   public char[] getBsl2BuildCount60091() throws CFException{
     if (isBsl2BuildCount60091Modified()) { 
        bsl2BuildCount60091 = refreshBsl2BuildCount60091();
     }
   		return bsl2BuildCount60091;
   }

  
	/**
	*  set variable bsl2BuildCount60091
	*  Corresponding COBOL Variable is 600-91BSL-2-BUILD-COUNT
	*  @param value
	**/
   public void setBsl2BuildCount60091(char[] value) {
      bsl2BuildCount60091 = checkBsl2BuildCount60091Constraints(value);
      serializeBsl2BuildCount60091(bsl2BuildCount60091);
   } 

     /**
	 * 	Update Bsl2BuildCount60091 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl2BuildCount60091(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsl2BuildCount60091,bsl2BuildCount60091.length);
   	
   }
   
   public void setBsl2BuildCount60091(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60091,bsl2BuildCount60091.length);
   	
   }
   
     /**
	 * 	Update Bsl2BuildCount60091 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl2BuildCount60091(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60091+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsl2BuildCount60091 with another Field
	 *	@param value
	 */
   public void setBsl2BuildCount60091(Field source) {
       replace(source,0,source.length(),beginBsl2BuildCount60091,BSL_2_BUILD_COUNT_60091_LEN);
   	
   }  
   
     /**
	 * 	Update Bsl2BuildCount60091 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl2BuildCount60091(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60091,BSL_2_BUILD_COUNT_60091_LEN);
   	
   }
   
     /**
	 * 	Update Bsl2BuildCount60091 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl2BuildCount60091(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60091+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl91DfltBsl2Msg600FieldLength() {
			return TBL_91_DFLT_BSL_2_MSG_600_LENGTH;
		}

}
  
