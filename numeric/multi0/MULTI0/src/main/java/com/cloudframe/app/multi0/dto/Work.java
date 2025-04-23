package com.cloudframe.app.multi0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.multi0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private BigDecimal wrkDb1dayFlt = BigDecimal.ZERO;

								private char[] wrkDb1dayFltDisp = Field.fillLowValue(11);

								private BigDecimal axisWpCoiAccum = BigDecimal.ZERO;

								private int axisWpCoiRound;

								private char[] axisWpCoiRoundDisp = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getWrkDb1dayFlt() throws CFException {
        if (isWrkDb1dayFltModified()) { 
           wrkDb1dayFlt = refreshWrkDb1dayFlt();
        }
   		return wrkDb1dayFlt;
	}

    public char[] getWrkDb1dayFltString() {
          return  wrkDb1dayFltString();
    }
	
	/**
	 * 	Update WrkDb1dayFlt with the passed number
	 *  Corresponding COBOL Variable is WRK-DB-1DAY-FLT
	 *	@param number
	 */
	public void setWrkDb1dayFlt(BigDecimal number) {	
     wrkDb1dayFlt = checkWrkDb1dayFltMaxLimit(number);
	    serializeWrkDb1dayFlt(wrkDb1dayFlt);
   }
	/**
	 *	Returns the value of wrkDb1dayFltDisp
	 *	@return wrkDb1dayFltDisp
	 */
   public char[] getWrkDb1dayFltDisp() throws CFException{
     if (isWrkDb1dayFltDispModified()) { 
        wrkDb1dayFltDisp = refreshWrkDb1dayFltDisp();
     }
   		return wrkDb1dayFltDisp;
   }

  
	/**
	*  set variable wrkDb1dayFltDisp
	*  Corresponding COBOL Variable is WRK-DB-1DAY-FLT-DISP
	*  @param value
	**/
   public void setWrkDb1dayFltDisp(char[] value) {
      wrkDb1dayFltDisp = checkWrkDb1dayFltDispConstraints(value);
      serializeWrkDb1dayFltDisp(wrkDb1dayFltDisp);
   } 

     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWrkDb1dayFltDisp,wrkDb1dayFltDisp.length);
   	
   }
   
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWrkDb1dayFltDisp,wrkDb1dayFltDisp.length);
   	
   }
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWrkDb1dayFltDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WrkDb1dayFltDisp with another Field
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source) {
       replace(source,0,source.length(),beginWrkDb1dayFltDisp,WRK_DB_1DAY_FLT_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWrkDb1dayFltDisp,WRK_DB_1DAY_FLT_DISP_LEN);
   	
   }
   
     /**
	 * 	Update WrkDb1dayFltDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWrkDb1dayFltDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWrkDb1dayFltDisp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public BigDecimal getAxisWpCoiAccum() throws CFException {
       if (isAxisWpCoiAccumModified()) { 
           axisWpCoiAccum = refreshAxisWpCoiAccum();
        }
   		return axisWpCoiAccum;
	}
	

    /**
	 *	Returns the String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumActualString() {
	    String value = String.valueOf(axisWpCoiAccum).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AxisWpCoiAccum with the passed number
	 *  Corresponding COBOL Variable is AXIS-WP-COI-ACCUM
	 *	@param number
	 */
	public void setAxisWpCoiAccum(BigDecimal number) {
       axisWpCoiAccum = checkAxisWpCoiAccumMaxLimit(number);
	    serializeAxisWpCoiAccum(axisWpCoiAccum);
   }
	/**
	 * 	Update AxisWpCoiAccum with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiAccum(char[] value) throws CFException {
		 axisWpCoiAccum = serializeAxisWpCoiAccum(value);
	}   
	/**
	 *	Returns the value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public int getAxisWpCoiRound() throws CFException {
       if (isAxisWpCoiRoundModified()) { 
           axisWpCoiRound = refreshAxisWpCoiRound();
        }
   		return axisWpCoiRound;
	}
	

    /**
	 *	Returns the String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundActualString() {
	    String value = String.valueOf(axisWpCoiRound).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *  Corresponding COBOL Variable is AXIS-WP-COI-ROUND
	 *	@param number
	 */
	public void setAxisWpCoiRound(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    axisWpCoiRound = checkAxisWpCoiRoundMaxLimit(number); 
		serializeAxisWpCoiRound(axisWpCoiRound);
	}
	

	public void setAxisWpCoiRound(long number) {
	    number = checkAxisWpCoiRoundMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAxisWpCoiRound((int)number);
	}
	
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRound(char[] value) throws CFException {
		 axisWpCoiRound = serializeAxisWpCoiRound(value);
	}
	/**
	 * 	Update AxisWpCoiRound with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRoundString(char[] value) throws CFException {
		 setAxisWpCoiRound(value);
	}
	/**
	 *	Returns the value of axisWpCoiRoundDisp
	 *	@return axisWpCoiRoundDisp
	 */
   public char[] getAxisWpCoiRoundDisp() throws CFException{
     if (isAxisWpCoiRoundDispModified()) { 
        axisWpCoiRoundDisp = refreshAxisWpCoiRoundDisp();
     }
   		return axisWpCoiRoundDisp;
   }

  
	/**
	*  set variable axisWpCoiRoundDisp
	*  Corresponding COBOL Variable is AXIS-WP-COI-ROUND-DISP
	*  @param value
	**/
   public void setAxisWpCoiRoundDisp(char[] value) {
      axisWpCoiRoundDisp = checkAxisWpCoiRoundDispConstraints(value);
      serializeAxisWpCoiRoundDisp(axisWpCoiRoundDisp);
   } 

     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAxisWpCoiRoundDisp,axisWpCoiRoundDisp.length);
   	
   }
   
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp,axisWpCoiRoundDisp.length);
   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AxisWpCoiRoundDisp with another Field
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source) {
       replace(source,0,source.length(),beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
   	
   }  
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp,AXIS_WP_COI_ROUND_DISP_LEN);
   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAxisWpCoiRoundDisp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
