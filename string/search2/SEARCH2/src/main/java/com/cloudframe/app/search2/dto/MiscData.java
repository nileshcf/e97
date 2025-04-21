package com.cloudframe.app.search2.dto;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class MiscData extends MiscDataSerialized {
   

								private short i;

						private char[] cmdCaHomeSidBidCode = Field.fillLowValue(5);

						private char[] tbls = new char[286];
			private List<TblsRedefined> tblsRedefined = new ArrayList<>();
    	
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBLS_REDEFINED_SIZE;arrayIndex++) {
						tblsRedefined.add(new TblsRedefined(this, beginTblsRedefined + 
						arrayIndex * TblsRedefined.getTblsRedefinedFieldLength()));
				}
	   	/*  end of offset */
								setTbls("00001AAAAAA00002BBBBBB00003CCCCCC00004DDDDDD00005EEEEEE00006FFFFFF00007GGGGGG00008HHHHHH00009IIIIII00010JJJJJJ00011KKKKKK00012LLLLLL00013MMMMMM00014NNNNNN00015OOOOOO00016PPPPPP00017QQQQQQ00018RRRRRR00019SSSSSS00020TTTTTT00021UUUUUU00022VVVVVV00023WWWWWW00024XXXXXX00025YYYYYY00026ZZZZZZ".toCharArray());
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
        if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	

	/**
	 *	Returns the value of cmdCaHomeSidBidCode
	 *	@return cmdCaHomeSidBidCode
	 */
   public char[] getCmdCaHomeSidBidCode() throws CFException{
     if (isCmdCaHomeSidBidCodeModified()) { 
        cmdCaHomeSidBidCode = refreshCmdCaHomeSidBidCode();
     }
   		return cmdCaHomeSidBidCode;
   }

  
	/**
	*  set variable cmdCaHomeSidBidCode
	*  Corresponding COBOL Variable is CMD-CA-HOME-SID-BID-CODE
	*  @param value
	**/
   public void setCmdCaHomeSidBidCode(char[] value) {
      cmdCaHomeSidBidCode = checkCmdCaHomeSidBidCodeConstraints(value);
      serializeCmdCaHomeSidBidCode(cmdCaHomeSidBidCode);
   } 

     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmdCaHomeSidBidCode,cmdCaHomeSidBidCode.length);
   	
   }
   
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmdCaHomeSidBidCode,cmdCaHomeSidBidCode.length);
   	
   }
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmdCaHomeSidBidCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmdCaHomeSidBidCode with another Field
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source) {
       replace(source,0,source.length(),beginCmdCaHomeSidBidCode,CMD_CA_HOME_SID_BID_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmdCaHomeSidBidCode,CMD_CA_HOME_SID_BID_CODE_LEN);
   	
   }
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmdCaHomeSidBidCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tbls
	 *	@return tbls
	 */
   public char[] getTbls() throws CFException{
     if (isTblsModified()) { 
        tbls = refreshTbls();
     }
   		return tbls;
   }

  
	/**
	*  set variable tbls
	*  Corresponding COBOL Variable is WS-TBLS
	*  @param value
	**/
   public void setTbls(char[] value) {
      tbls = checkTblsConstraints(value);
      serializeTbls(tbls);
   } 

     /**
	 * 	Update Tbls 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTbls(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTbls,tbls.length);
   	
   }
   
   public void setTbls(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTbls,tbls.length);
   	
   }
   
     /**
	 * 	Update Tbls 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTbls(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTbls+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tbls with another Field
	 *	@param value
	 */
   public void setTbls(Field source) {
       replace(source,0,source.length(),beginTbls,TBLS_LEN);
   	
   }  
   
     /**
	 * 	Update Tbls 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTbls(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTbls,TBLS_LEN);
   	
   }
   
     /**
	 * 	Update Tbls 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTbls(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTbls+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of tblsRedefined
	 *  Corresponding COBOL Variable is WS-TBLS-REDEFINED
	 *	@return tblsRedefined
	 */
   public List<TblsRedefined> getTblsRedefined() {
       return tblsRedefined;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tblsRedefined
	 */
	public TblsRedefined getTblsRedefined(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTblsRedefined(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TBLS_REDEFINED_SIZE) {
             	index = TBLS_REDEFINED_SIZE -1; // can't exceed max array size
             	logger.trace("tblsRedefined - Array index exceeded max Size {}, resetting it to max allowed",TBLS_REDEFINED_SIZE); 
	    }
		if (index >= tblsRedefined.size()) {
       		for (int fillIndex =  tblsRedefined.size() -1; fillIndex < index;fillIndex++) {
		       tblsRedefined.add(null);
		    }
			tblsRedefined.set(index,
			   	   	new TblsRedefined(this,beginTblsRedefined + index * TblsRedefined.getTblsRedefinedFieldLength()) 
				                        ); 	
		} 
   	   TblsRedefined value = tblsRedefined.get(index);
   	   if (value == null) {
   	      tblsRedefined.set(index,
			   	   	new TblsRedefined(this,beginTblsRedefined + index * TblsRedefined.getTblsRedefinedFieldLength()) 
				                        ); 
		  value = tblsRedefined.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TblsRedefined at index with the passed value
	 *  Corresponding COBOL Variable is WS-TBLS-REDEFINED
	 *  @param index
	 *	@param value
	 */
  public void setTblsRedefined(int index,char[] value) {
   	getTblsRedefined(index).setString(value);
   }
   
	

	
	
	

		public static int getMiscDataFieldLength() {
			return MISC_DATA_LENGTH;
		}

}
  
