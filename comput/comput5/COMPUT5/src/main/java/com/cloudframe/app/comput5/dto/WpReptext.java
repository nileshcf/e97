package com.cloudframe.app.comput5.dto;

/**
*  The class WpReptext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WpReptext extends WpReptextSerialized { 
   
				private WpReptextPrintLine wpReptextPrintLine = new WpReptextPrintLine();
	
	/**
	* Constructor for WpReptext
	**/
    public WpReptext() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wpReptextPrintLine.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wpReptextPrintLine
	 *	@return wpReptextPrintLine
	 */   
	 public WpReptextPrintLine getWpReptextPrintLine() {
   	return wpReptextPrintLine;
   }
   /**
	* 	Update WpReptextPrintLine with the passed value
	*   Corresponding COBOL Variable is WP-REPTEXT-PRINT-LINE
	*	@param value
	*/
   public void setWpReptextPrintLine(char[] value) {
      wpReptextPrintLine.setString(value); 
   }   
    
     /**
	 * 	Update WpReptextPrintLine 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWpReptextPrintLine(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wpReptextPrintLine.begin,wpReptextPrintLine.length());
   }
   
     /**
	 * 	Update WpReptextPrintLine 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpReptextPrintLine(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wpReptextPrintLine.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WpReptextPrintLine with another Field
	 *	@param value
	 */
   public void setWpReptextPrintLine(Field source) {
   	replace(source,0,source.length(),wpReptextPrintLine.begin,wpReptextPrintLine.length());
   }  
   
     /**
	 * 	Update WpReptextPrintLine 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWpReptextPrintLine(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wpReptextPrintLine.begin,wpReptextPrintLine.length());
   }
   
     /**
	 * 	Update WpReptextPrintLine 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpReptextPrintLine(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wpReptextPrintLine.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes WpReptext
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          wpReptextPrintLine.initialize();
     
   }

		public static int getWpReptextFieldLength() {
			return WP_REPTEXT_LENGTH;
		}

}
  
