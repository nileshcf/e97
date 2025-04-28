package com.cloudframe.app.sf327010.dto;

/**
*  The class HdrLine2202 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class HdrLine2202 extends HdrLine2202Serialized {
   



						private char[] serverId202 = new char[3];






								private char[] pageCount202 = new char[11];
							
	
	/**
	* Constructor for HdrLine2202
	**/
    public HdrLine2202() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SERVER ID:").toCharArray()
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 10
             ,1
             );
								setServerId202(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(28)
             , getStartOffset() + 14
             ,28
             );
       replaceValue( // serialize and save the value
             ("ASA SERVER ACTIVITY SUMMARY REPORT").toCharArray()
             , getStartOffset() + 42
             ,34
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 76
             ,27
             );
       replaceValue( // serialize and save the value
             ("PAGE    :").toCharArray()
             , getStartOffset() + 103
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
								setPageCount202(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of serverId202
	 *	@return serverId202
	 */
   public char[] getServerId202() throws CFException{
     if (isServerId202Modified()) { 
        serverId202 = refreshServerId202();
     }
   		return serverId202;
   }

  
	/**
	*  set variable serverId202
	*  Corresponding COBOL Variable is 202-SERVER-ID
	*  @param value
	**/
   public void setServerId202(char[] value) {
      serverId202 = checkServerId202Constraints(value);
      serializeServerId202(serverId202);
   } 

     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginServerId202,serverId202.length);
   	
   }
   
   public void setServerId202(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginServerId202,serverId202.length);
   	
   }
   
     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServerId202+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ServerId202 with another Field
	 *	@param value
	 */
   public void setServerId202(Field source) {
       replace(source,0,source.length(),beginServerId202,SERVER_ID_202_LEN);
   	
   }  
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginServerId202,SERVER_ID_202_LEN);
   	
   }
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServerId202+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pageCount202
	 *	@return pageCount202
	 */
   public char[] getPageCount202() throws CFException{
     if (isPageCount202Modified()) { 
        pageCount202 = refreshPageCount202();
     }
   		return pageCount202;
   }

  
	/**
	*  set variable pageCount202
	*  Corresponding COBOL Variable is 202-PAGE-COUNT
	*  @param value
	**/
   public void setPageCount202(char[] value) {
      pageCount202 = checkPageCount202Constraints(value);
      serializePageCount202(pageCount202);
   } 

     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPageCount202,pageCount202.length);
   	
   }
   
   public void setPageCount202(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPageCount202,pageCount202.length);
   	
   }
   
     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPageCount202+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PageCount202 with another Field
	 *	@param value
	 */
   public void setPageCount202(Field source) {
       replace(source,0,source.length(),beginPageCount202,PAGE_COUNT_202_LEN);
   	
   }  
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPageCount202,PAGE_COUNT_202_LEN);
   	
   }
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPageCount202+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrLine2202FieldLength() {
			return HDR_LINE_2202_LENGTH;
		}

}
  
