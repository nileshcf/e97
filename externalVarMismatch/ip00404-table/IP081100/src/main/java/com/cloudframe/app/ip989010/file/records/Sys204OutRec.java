package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys204OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys204OutRec extends Sys204OutRecSerialized {
   

								private long sys204InRecCnt;

						private char[] sys204StatusCd = Field.fillLowValue(1);

								private long sys204OutRecCnt;
	
	/**
	* Constructor for Sys204OutRec
	**/
    public Sys204OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys204InRecCnt
	 *	@return sys204InRecCnt
	 */
	public long getSys204InRecCnt() throws CFException {
       if (isSys204InRecCntModified()) { 
           sys204InRecCnt = refreshSys204InRecCnt();
        }
   		return sys204InRecCnt;
	}
	

	
	   
	/**
	 * 	Update Sys204InRecCnt with the passed value
	 *  Corresponding COBOL Variable is SYS204-IN-REC-CNT
	 *	@param number
	 */
	public void setSys204InRecCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys204InRecCnt = checkSys204InRecCntMaxLimit(number); 
		serializeSys204InRecCnt(sys204InRecCnt);
	}
	

	/**
	 * 	Update Sys204InRecCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys204InRecCnt(char[] value) throws CFException {
		 sys204InRecCnt = serializeSys204InRecCnt(value);
	}
	/**
	 * 	Update Sys204InRecCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys204InRecCntString(char[] value) throws CFException {
		 setSys204InRecCnt(value);
	}
	/**
	 *	Returns the value of sys204StatusCd
	 *	@return sys204StatusCd
	 */
   public char[] getSys204StatusCd() throws CFException{
     if (isSys204StatusCdModified()) { 
        sys204StatusCd = refreshSys204StatusCd();
     }
   		return sys204StatusCd;
   }

  
	/**
	*  set variable sys204StatusCd
	*  Corresponding COBOL Variable is SYS204-STATUS-CD
	*  @param value
	**/
   public void setSys204StatusCd(char[] value) {
      sys204StatusCd = checkSys204StatusCdConstraints(value);
      serializeSys204StatusCd(sys204StatusCd);
   } 

     /**
	 * 	Update Sys204StatusCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys204StatusCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys204StatusCd,sys204StatusCd.length);
   	
   }
   
   public void setSys204StatusCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys204StatusCd,sys204StatusCd.length);
   	
   }
   
     /**
	 * 	Update Sys204StatusCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys204StatusCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204StatusCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys204StatusCd with another Field
	 *	@param value
	 */
   public void setSys204StatusCd(Field source) {
       replace(source,0,source.length(),beginSys204StatusCd,SYS_204_STATUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Sys204StatusCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys204StatusCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys204StatusCd,SYS_204_STATUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Sys204StatusCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys204StatusCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204StatusCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys204OutRecCnt
	 *	@return sys204OutRecCnt
	 */
	public long getSys204OutRecCnt() throws CFException {
       if (isSys204OutRecCntModified()) { 
           sys204OutRecCnt = refreshSys204OutRecCnt();
        }
   		return sys204OutRecCnt;
	}
	

	
	   
	/**
	 * 	Update Sys204OutRecCnt with the passed value
	 *  Corresponding COBOL Variable is SYS204-OUT-REC-CNT
	 *	@param number
	 */
	public void setSys204OutRecCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys204OutRecCnt = checkSys204OutRecCntMaxLimit(number); 
		serializeSys204OutRecCnt(sys204OutRecCnt);
	}
	

	/**
	 * 	Update Sys204OutRecCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys204OutRecCnt(char[] value) throws CFException {
		 sys204OutRecCnt = serializeSys204OutRecCnt(value);
	}
	/**
	 * 	Update Sys204OutRecCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys204OutRecCntString(char[] value) throws CFException {
		 setSys204OutRecCnt(value);
	}

	
	
	

		public static int getSys204OutRecFieldLength() {
			return SYS_204_OUT_REC_LENGTH;
		}

}
  
