package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl90DfltBsl2Msg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl90DfltBsl2Msg600 extends Tbl90DfltBsl2Msg600Serialized { 
   


								private char[] bsl2BuildCount60090 = new char[10];
							
	
	/**
	* Constructor for Tbl90DfltBsl2Msg600
	**/
    public Tbl90DfltBsl2Msg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE90 DEFAULT INTRAREGIONAL RECORDS BUILD:").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setBsl2BuildCount60090(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of bsl2BuildCount60090
	 *	@return bsl2BuildCount60090
	 */
   public char[] getBsl2BuildCount60090() throws CFException{
     if (isBsl2BuildCount60090Modified()) { 
        bsl2BuildCount60090 = refreshBsl2BuildCount60090();
     }
   		return bsl2BuildCount60090;
   }

  
	/**
	*  set variable bsl2BuildCount60090
	*  Corresponding COBOL Variable is 600-90BSL-2-BUILD-COUNT
	*  @param value
	**/
   public void setBsl2BuildCount60090(char[] value) {
      bsl2BuildCount60090 = checkBsl2BuildCount60090Constraints(value);
      serializeBsl2BuildCount60090(bsl2BuildCount60090);
   } 

     /**
	 * 	Update Bsl2BuildCount60090 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl2BuildCount60090(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsl2BuildCount60090,bsl2BuildCount60090.length);
   	
   }
   
   public void setBsl2BuildCount60090(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60090,bsl2BuildCount60090.length);
   	
   }
   
     /**
	 * 	Update Bsl2BuildCount60090 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl2BuildCount60090(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60090+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsl2BuildCount60090 with another Field
	 *	@param value
	 */
   public void setBsl2BuildCount60090(Field source) {
       replace(source,0,source.length(),beginBsl2BuildCount60090,BSL_2_BUILD_COUNT_60090_LEN);
   	
   }  
   
     /**
	 * 	Update Bsl2BuildCount60090 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl2BuildCount60090(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60090,BSL_2_BUILD_COUNT_60090_LEN);
   	
   }
   
     /**
	 * 	Update Bsl2BuildCount60090 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl2BuildCount60090(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl2BuildCount60090+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl90DfltBsl2Msg600FieldLength() {
			return TBL_90_DFLT_BSL_2_MSG_600_LENGTH;
		}

}
  
