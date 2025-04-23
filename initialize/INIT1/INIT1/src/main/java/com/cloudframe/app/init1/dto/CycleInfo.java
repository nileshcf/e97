package com.cloudframe.app.init1.dto;

/**
*  The class CycleInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CycleInfo extends CycleInfoSerialized {
   

								private int jobIterNo;

						private char[] blTypCd = Field.fillLowValue(2);

								private int cycNo;

						private char[] cycAsofDt = Field.fillLowValue(10);

						private char[] cycStartDt = Field.fillLowValue(10);

						private char[] cycEndDt = Field.fillLowValue(10);

								private long cycStartDtIso;

								private long cycEndDtIso;

						private char[] cycMthYr = Field.fillLowValue(6);

						private char[] blStreamCd = Field.fillLowValue(1);

						private char[] visionInstanceCd = Field.fillLowValue(1);

								private long chgBlEndIso;
				private ChgBlEndIsoRedefined chgBlEndIsoRedefined = new ChgBlEndIsoRedefined();

								private long chgDtIso;
				private ChgDtIsoRedefined chgDtIsoRedefined = new ChgDtIsoRedefined();

								private long chgStartDtIso;
				private ChgStartDtIsoRedefined chgStartDtIsoRedefined = new ChgStartDtIsoRedefined();

								private long chgStartDtIso2;
				private ChgStartDtIso2Redefined chgStartDtIso2Redefined = new ChgStartDtIso2Redefined();

								private long chgStartDtIso3;
				private ChgStartDtIso3Redefined chgStartDtIso3Redefined = new ChgStartDtIso3Redefined();

								private long chgEndDtIso;
				private ChgEndDtIsoRedefined chgEndDtIsoRedefined = new ChgEndDtIsoRedefined();

								private long chgEndDtIso2;
				private ChgEndDtIso2Redefined chgEndDtIso2Redefined = new ChgEndDtIso2Redefined();

								private long chgEndDtIso3;
				private ChgEndDtIso3Redefined chgEndDtIso3Redefined = new ChgEndDtIso3Redefined();

						private char[] cycChangeNo = Field.fillLowValue(2);

								private int cycChangeBp;

								private int leapYear;

								private int leapYearRemainder;
	
	/**
	* Constructor for CycleInfo
	**/
    public CycleInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			chgBlEndIsoRedefined.setParent(this,getStartOffset() + 60);
	       			chgDtIsoRedefined.setParent(this,getStartOffset() + 68);
	       			chgStartDtIsoRedefined.setParent(this,getStartOffset() + 76);
	       			chgStartDtIso2Redefined.setParent(this,getStartOffset() + 84);
	       			chgStartDtIso3Redefined.setParent(this,getStartOffset() + 92);
	       			chgEndDtIsoRedefined.setParent(this,getStartOffset() + 100);
	       			chgEndDtIso2Redefined.setParent(this,getStartOffset() + 108);
	       			chgEndDtIso3Redefined.setParent(this,getStartOffset() + 116);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of jobIterNo
	 *	@return jobIterNo
	 */
	public int getJobIterNo() throws CFException {
       if (isJobIterNoModified()) { 
           jobIterNo = refreshJobIterNo();
        }
   		return jobIterNo;
	}
	

	
	   
	/**
	 * 	Update JobIterNo with the passed value
	 *  Corresponding COBOL Variable is WS-JOB-ITER-NO
	 *	@param number
	 */
	public void setJobIterNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    jobIterNo = checkJobIterNoMaxLimit(number); 
		serializeJobIterNo(jobIterNo);
	}
	

	public void setJobIterNo(long number) {
	    number = checkJobIterNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setJobIterNo((int)number);
	}
	
	/**
	 * 	Update JobIterNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setJobIterNo(char[] value) throws CFException {
		 jobIterNo = serializeJobIterNo(value);
	}
	/**
	 * 	Update JobIterNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJobIterNoString(char[] value) throws CFException {
		 setJobIterNo(value);
	}
	/**
	 *	Returns the value of blTypCd
	 *	@return blTypCd
	 */
   public char[] getBlTypCd() throws CFException{
     if (isBlTypCdModified()) { 
        blTypCd = refreshBlTypCd();
     }
   		return blTypCd;
   }

  
	/**
	*  set variable blTypCd
	*  Corresponding COBOL Variable is WS-BL-TYP-CD
	*  @param value
	**/
   public void setBlTypCd(char[] value) {
      blTypCd = checkBlTypCdConstraints(value);
      serializeBlTypCd(blTypCd);
   } 

     /**
	 * 	Update BlTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBlTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBlTypCd,blTypCd.length);
   	
   }
   
   public void setBlTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBlTypCd,blTypCd.length);
   	
   }
   
     /**
	 * 	Update BlTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBlTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BlTypCd with another Field
	 *	@param value
	 */
   public void setBlTypCd(Field source) {
       replace(source,0,source.length(),beginBlTypCd,BL_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update BlTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBlTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBlTypCd,BL_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update BlTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBlTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cycNo
	 *	@return cycNo
	 */
	public int getCycNo() throws CFException {
       if (isCycNoModified()) { 
           cycNo = refreshCycNo();
        }
   		return cycNo;
	}
	

	
	   
	/**
	 * 	Update CycNo with the passed value
	 *  Corresponding COBOL Variable is WS-CYC-NO
	 *	@param number
	 */
	public void setCycNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cycNo = checkCycNoMaxLimit(number); 
		serializeCycNo(cycNo);
	}
	

	public void setCycNo(long number) {
	    number = checkCycNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCycNo((int)number);
	}
	
	/**
	 * 	Update CycNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setCycNo(char[] value) throws CFException {
		 cycNo = serializeCycNo(value);
	}
	/**
	 * 	Update CycNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCycNoString(char[] value) throws CFException {
		 setCycNo(value);
	}
	/**
	 *	Returns the value of cycAsofDt
	 *	@return cycAsofDt
	 */
   public char[] getCycAsofDt() throws CFException{
     if (isCycAsofDtModified()) { 
        cycAsofDt = refreshCycAsofDt();
     }
   		return cycAsofDt;
   }

  
	/**
	*  set variable cycAsofDt
	*  Corresponding COBOL Variable is WS-CYC-ASOF-DT
	*  @param value
	**/
   public void setCycAsofDt(char[] value) {
      cycAsofDt = checkCycAsofDtConstraints(value);
      serializeCycAsofDt(cycAsofDt);
   } 

     /**
	 * 	Update CycAsofDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCycAsofDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCycAsofDt,cycAsofDt.length);
   	
   }
   
   public void setCycAsofDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCycAsofDt,cycAsofDt.length);
   	
   }
   
     /**
	 * 	Update CycAsofDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCycAsofDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycAsofDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CycAsofDt with another Field
	 *	@param value
	 */
   public void setCycAsofDt(Field source) {
       replace(source,0,source.length(),beginCycAsofDt,CYC_ASOF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update CycAsofDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCycAsofDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCycAsofDt,CYC_ASOF_DT_LEN);
   	
   }
   
     /**
	 * 	Update CycAsofDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCycAsofDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycAsofDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cycStartDt
	 *	@return cycStartDt
	 */
   public char[] getCycStartDt() throws CFException{
     if (isCycStartDtModified()) { 
        cycStartDt = refreshCycStartDt();
     }
   		return cycStartDt;
   }

  
	/**
	*  set variable cycStartDt
	*  Corresponding COBOL Variable is WS-CYC-START-DT
	*  @param value
	**/
   public void setCycStartDt(char[] value) {
      cycStartDt = checkCycStartDtConstraints(value);
      serializeCycStartDt(cycStartDt);
   } 

     /**
	 * 	Update CycStartDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCycStartDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCycStartDt,cycStartDt.length);
   	
   }
   
   public void setCycStartDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCycStartDt,cycStartDt.length);
   	
   }
   
     /**
	 * 	Update CycStartDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCycStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycStartDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CycStartDt with another Field
	 *	@param value
	 */
   public void setCycStartDt(Field source) {
       replace(source,0,source.length(),beginCycStartDt,CYC_START_DT_LEN);
   	
   }  
   
     /**
	 * 	Update CycStartDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCycStartDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCycStartDt,CYC_START_DT_LEN);
   	
   }
   
     /**
	 * 	Update CycStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCycStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycStartDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cycEndDt
	 *	@return cycEndDt
	 */
   public char[] getCycEndDt() throws CFException{
     if (isCycEndDtModified()) { 
        cycEndDt = refreshCycEndDt();
     }
   		return cycEndDt;
   }

  
	/**
	*  set variable cycEndDt
	*  Corresponding COBOL Variable is WS-CYC-END-DT
	*  @param value
	**/
   public void setCycEndDt(char[] value) {
      cycEndDt = checkCycEndDtConstraints(value);
      serializeCycEndDt(cycEndDt);
   } 

     /**
	 * 	Update CycEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCycEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCycEndDt,cycEndDt.length);
   	
   }
   
   public void setCycEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCycEndDt,cycEndDt.length);
   	
   }
   
     /**
	 * 	Update CycEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCycEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CycEndDt with another Field
	 *	@param value
	 */
   public void setCycEndDt(Field source) {
       replace(source,0,source.length(),beginCycEndDt,CYC_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update CycEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCycEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCycEndDt,CYC_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update CycEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCycEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycEndDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cycStartDtIso
	 *	@return cycStartDtIso
	 */
	public long getCycStartDtIso() throws CFException {
       if (isCycStartDtIsoModified()) { 
           cycStartDtIso = refreshCycStartDtIso();
        }
   		return cycStartDtIso;
	}
	

	
	   
	/**
	 * 	Update CycStartDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-CYC-START-DT-ISO
	 *	@param number
	 */
	public void setCycStartDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cycStartDtIso = checkCycStartDtIsoMaxLimit(number); 
		serializeCycStartDtIso(cycStartDtIso);
	}
	

	/**
	 * 	Update CycStartDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setCycStartDtIso(char[] value) throws CFException {
		 cycStartDtIso = serializeCycStartDtIso(value);
	}
	/**
	 * 	Update CycStartDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCycStartDtIsoString(char[] value) throws CFException {
		 setCycStartDtIso(value);
	}
	/**
	 *	Returns the value of cycEndDtIso
	 *	@return cycEndDtIso
	 */
	public long getCycEndDtIso() throws CFException {
       if (isCycEndDtIsoModified()) { 
           cycEndDtIso = refreshCycEndDtIso();
        }
   		return cycEndDtIso;
	}
	

	
	   
	/**
	 * 	Update CycEndDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-CYC-END-DT-ISO
	 *	@param number
	 */
	public void setCycEndDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cycEndDtIso = checkCycEndDtIsoMaxLimit(number); 
		serializeCycEndDtIso(cycEndDtIso);
	}
	

	/**
	 * 	Update CycEndDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setCycEndDtIso(char[] value) throws CFException {
		 cycEndDtIso = serializeCycEndDtIso(value);
	}
	/**
	 * 	Update CycEndDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCycEndDtIsoString(char[] value) throws CFException {
		 setCycEndDtIso(value);
	}
	/**
	 *	Returns the value of cycMthYr
	 *	@return cycMthYr
	 */
   public char[] getCycMthYr() throws CFException{
     if (isCycMthYrModified()) { 
        cycMthYr = refreshCycMthYr();
     }
   		return cycMthYr;
   }

  
	/**
	*  set variable cycMthYr
	*  Corresponding COBOL Variable is WS-CYC-MTH-YR
	*  @param value
	**/
   public void setCycMthYr(char[] value) {
      cycMthYr = checkCycMthYrConstraints(value);
      serializeCycMthYr(cycMthYr);
   } 

     /**
	 * 	Update CycMthYr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCycMthYr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCycMthYr,cycMthYr.length);
   	
   }
   
   public void setCycMthYr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCycMthYr,cycMthYr.length);
   	
   }
   
     /**
	 * 	Update CycMthYr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCycMthYr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycMthYr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CycMthYr with another Field
	 *	@param value
	 */
   public void setCycMthYr(Field source) {
       replace(source,0,source.length(),beginCycMthYr,CYC_MTH_YR_LEN);
   	
   }  
   
     /**
	 * 	Update CycMthYr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCycMthYr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCycMthYr,CYC_MTH_YR_LEN);
   	
   }
   
     /**
	 * 	Update CycMthYr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCycMthYr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycMthYr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of blStreamCd
	 *	@return blStreamCd
	 */
   public char[] getBlStreamCd() throws CFException{
     if (isBlStreamCdModified()) { 
        blStreamCd = refreshBlStreamCd();
     }
   		return blStreamCd;
   }

  
	/**
	*  set variable blStreamCd
	*  Corresponding COBOL Variable is WS-BL-STREAM-CD
	*  @param value
	**/
   public void setBlStreamCd(char[] value) {
      blStreamCd = checkBlStreamCdConstraints(value);
      serializeBlStreamCd(blStreamCd);
   } 

     /**
	 * 	Update BlStreamCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBlStreamCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBlStreamCd,blStreamCd.length);
   	
   }
   
   public void setBlStreamCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBlStreamCd,blStreamCd.length);
   	
   }
   
     /**
	 * 	Update BlStreamCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBlStreamCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlStreamCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BlStreamCd with another Field
	 *	@param value
	 */
   public void setBlStreamCd(Field source) {
       replace(source,0,source.length(),beginBlStreamCd,BL_STREAM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update BlStreamCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBlStreamCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBlStreamCd,BL_STREAM_CD_LEN);
   	
   }
   
     /**
	 * 	Update BlStreamCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBlStreamCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlStreamCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of visionInstanceCd
	 *	@return visionInstanceCd
	 */
   public char[] getVisionInstanceCd() throws CFException{
     if (isVisionInstanceCdModified()) { 
        visionInstanceCd = refreshVisionInstanceCd();
     }
   		return visionInstanceCd;
   }

  
	/**
	*  set variable visionInstanceCd
	*  Corresponding COBOL Variable is WS-VISION-INSTANCE-CD
	*  @param value
	**/
   public void setVisionInstanceCd(char[] value) {
      visionInstanceCd = checkVisionInstanceCdConstraints(value);
      serializeVisionInstanceCd(visionInstanceCd);
   } 

     /**
	 * 	Update VisionInstanceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVisionInstanceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVisionInstanceCd,visionInstanceCd.length);
   	
   }
   
   public void setVisionInstanceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVisionInstanceCd,visionInstanceCd.length);
   	
   }
   
     /**
	 * 	Update VisionInstanceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVisionInstanceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVisionInstanceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VisionInstanceCd with another Field
	 *	@param value
	 */
   public void setVisionInstanceCd(Field source) {
       replace(source,0,source.length(),beginVisionInstanceCd,VISION_INSTANCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update VisionInstanceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVisionInstanceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVisionInstanceCd,VISION_INSTANCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update VisionInstanceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVisionInstanceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVisionInstanceCd+targetIndex,targetLen);
    
   }
	char[] visionB2bInstance88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isVisionB2bInstance()
	 *	@return  Returns true if isVisionB2bInstance() is "B"
	 */
   public boolean isVisionB2bInstance() throws CFException {
      return (  compareChars( getVisionInstanceCd() , visionB2bInstance88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setVisionB2bInstanceTrue() {  			
    	setVisionInstanceCd( visionB2bInstance88Value);
   	}
	/**
	 *	Returns the value of chgBlEndIso
	 *	@return chgBlEndIso
	 */
	public long getChgBlEndIso() throws CFException {
       if (isChgBlEndIsoModified()) { 
           chgBlEndIso = refreshChgBlEndIso();
        }
   		return chgBlEndIso;
	}
	

	
	   
	/**
	 * 	Update ChgBlEndIso with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-BL-END-ISO
	 *	@param number
	 */
	public void setChgBlEndIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgBlEndIso = checkChgBlEndIsoMaxLimit(number); 
		serializeChgBlEndIso(chgBlEndIso);
	}
	

	/**
	 * 	Update ChgBlEndIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgBlEndIso(char[] value) throws CFException {
		 chgBlEndIso = serializeChgBlEndIso(value);
	}
	/**
	 * 	Update ChgBlEndIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgBlEndIsoString(char[] value) throws CFException {
		 setChgBlEndIso(value);
	}
	/**
	 *	Returns the value of chgBlEndIsoRedefined
	 *	@return chgBlEndIsoRedefined
	 */   
	 public ChgBlEndIsoRedefined getChgBlEndIsoRedefined() {
   	return chgBlEndIsoRedefined;
   }
   /**
	* 	Update ChgBlEndIsoRedefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-BL-END-ISO-REDEFINED
	*	@param value
	*/
   public void setChgBlEndIsoRedefined(char[] value) {
      chgBlEndIsoRedefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgBlEndIsoRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgBlEndIsoRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgBlEndIsoRedefined.begin,chgBlEndIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgBlEndIsoRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgBlEndIsoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgBlEndIsoRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgBlEndIsoRedefined with another Field
	 *	@param value
	 */
   public void setChgBlEndIsoRedefined(Field source) {
   	replace(source,0,source.length(),chgBlEndIsoRedefined.begin,chgBlEndIsoRedefined.length());
   }  
   
     /**
	 * 	Update ChgBlEndIsoRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgBlEndIsoRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgBlEndIsoRedefined.begin,chgBlEndIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgBlEndIsoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgBlEndIsoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgBlEndIsoRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgDtIso
	 *	@return chgDtIso
	 */
	public long getChgDtIso() throws CFException {
       if (isChgDtIsoModified()) { 
           chgDtIso = refreshChgDtIso();
        }
   		return chgDtIso;
	}
	

	
	   
	/**
	 * 	Update ChgDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-DT-ISO
	 *	@param number
	 */
	public void setChgDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgDtIso = checkChgDtIsoMaxLimit(number); 
		serializeChgDtIso(chgDtIso);
	}
	

	/**
	 * 	Update ChgDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgDtIso(char[] value) throws CFException {
		 chgDtIso = serializeChgDtIso(value);
	}
	/**
	 * 	Update ChgDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgDtIsoString(char[] value) throws CFException {
		 setChgDtIso(value);
	}
	/**
	 *	Returns the value of chgDtIsoRedefined
	 *	@return chgDtIsoRedefined
	 */   
	 public ChgDtIsoRedefined getChgDtIsoRedefined() {
   	return chgDtIsoRedefined;
   }
   /**
	* 	Update ChgDtIsoRedefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-DT-ISO-REDEFINED
	*	@param value
	*/
   public void setChgDtIsoRedefined(char[] value) {
      chgDtIsoRedefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgDtIsoRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgDtIsoRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgDtIsoRedefined.begin,chgDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgDtIsoRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgDtIsoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgDtIsoRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgDtIsoRedefined with another Field
	 *	@param value
	 */
   public void setChgDtIsoRedefined(Field source) {
   	replace(source,0,source.length(),chgDtIsoRedefined.begin,chgDtIsoRedefined.length());
   }  
   
     /**
	 * 	Update ChgDtIsoRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgDtIsoRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgDtIsoRedefined.begin,chgDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgDtIsoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgDtIsoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgDtIsoRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgStartDtIso
	 *	@return chgStartDtIso
	 */
	public long getChgStartDtIso() throws CFException {
       if (isChgStartDtIsoModified()) { 
           chgStartDtIso = refreshChgStartDtIso();
        }
   		return chgStartDtIso;
	}
	

	
	   
	/**
	 * 	Update ChgStartDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DT-ISO
	 *	@param number
	 */
	public void setChgStartDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDtIso = checkChgStartDtIsoMaxLimit(number); 
		serializeChgStartDtIso(chgStartDtIso);
	}
	

	/**
	 * 	Update ChgStartDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIso(char[] value) throws CFException {
		 chgStartDtIso = serializeChgStartDtIso(value);
	}
	/**
	 * 	Update ChgStartDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIsoString(char[] value) throws CFException {
		 setChgStartDtIso(value);
	}
	/**
	 *	Returns the value of chgStartDtIsoRedefined
	 *	@return chgStartDtIsoRedefined
	 */   
	 public ChgStartDtIsoRedefined getChgStartDtIsoRedefined() {
   	return chgStartDtIsoRedefined;
   }
   /**
	* 	Update ChgStartDtIsoRedefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-START-DT-ISO-REDEFINED
	*	@param value
	*/
   public void setChgStartDtIsoRedefined(char[] value) {
      chgStartDtIsoRedefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgStartDtIsoRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIsoRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIsoRedefined.begin,chgStartDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIsoRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIsoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIsoRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgStartDtIsoRedefined with another Field
	 *	@param value
	 */
   public void setChgStartDtIsoRedefined(Field source) {
   	replace(source,0,source.length(),chgStartDtIsoRedefined.begin,chgStartDtIsoRedefined.length());
   }  
   
     /**
	 * 	Update ChgStartDtIsoRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIsoRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIsoRedefined.begin,chgStartDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIsoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIsoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIsoRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgStartDtIso2
	 *	@return chgStartDtIso2
	 */
	public long getChgStartDtIso2() throws CFException {
       if (isChgStartDtIso2Modified()) { 
           chgStartDtIso2 = refreshChgStartDtIso2();
        }
   		return chgStartDtIso2;
	}
	

	
	   
	/**
	 * 	Update ChgStartDtIso2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DT-ISO-2
	 *	@param number
	 */
	public void setChgStartDtIso2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDtIso2 = checkChgStartDtIso2MaxLimit(number); 
		serializeChgStartDtIso2(chgStartDtIso2);
	}
	

	/**
	 * 	Update ChgStartDtIso2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIso2(char[] value) throws CFException {
		 chgStartDtIso2 = serializeChgStartDtIso2(value);
	}
	/**
	 * 	Update ChgStartDtIso2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIso2String(char[] value) throws CFException {
		 setChgStartDtIso2(value);
	}
	/**
	 *	Returns the value of chgStartDtIso2Redefined
	 *	@return chgStartDtIso2Redefined
	 */   
	 public ChgStartDtIso2Redefined getChgStartDtIso2Redefined() {
   	return chgStartDtIso2Redefined;
   }
   /**
	* 	Update ChgStartDtIso2Redefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-START-DT-ISO-2-REDEFINED
	*	@param value
	*/
   public void setChgStartDtIso2Redefined(char[] value) {
      chgStartDtIso2Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgStartDtIso2Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIso2Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso2Redefined.begin,chgStartDtIso2Redefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIso2Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIso2Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso2Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgStartDtIso2Redefined with another Field
	 *	@param value
	 */
   public void setChgStartDtIso2Redefined(Field source) {
   	replace(source,0,source.length(),chgStartDtIso2Redefined.begin,chgStartDtIso2Redefined.length());
   }  
   
     /**
	 * 	Update ChgStartDtIso2Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIso2Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso2Redefined.begin,chgStartDtIso2Redefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIso2Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIso2Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso2Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgStartDtIso3
	 *	@return chgStartDtIso3
	 */
	public long getChgStartDtIso3() throws CFException {
       if (isChgStartDtIso3Modified()) { 
           chgStartDtIso3 = refreshChgStartDtIso3();
        }
   		return chgStartDtIso3;
	}
	

	
	   
	/**
	 * 	Update ChgStartDtIso3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DT-ISO-3
	 *	@param number
	 */
	public void setChgStartDtIso3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDtIso3 = checkChgStartDtIso3MaxLimit(number); 
		serializeChgStartDtIso3(chgStartDtIso3);
	}
	

	/**
	 * 	Update ChgStartDtIso3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIso3(char[] value) throws CFException {
		 chgStartDtIso3 = serializeChgStartDtIso3(value);
	}
	/**
	 * 	Update ChgStartDtIso3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDtIso3String(char[] value) throws CFException {
		 setChgStartDtIso3(value);
	}
	/**
	 *	Returns the value of chgStartDtIso3Redefined
	 *	@return chgStartDtIso3Redefined
	 */   
	 public ChgStartDtIso3Redefined getChgStartDtIso3Redefined() {
   	return chgStartDtIso3Redefined;
   }
   /**
	* 	Update ChgStartDtIso3Redefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-START-DT-ISO-3-REDEFINED
	*	@param value
	*/
   public void setChgStartDtIso3Redefined(char[] value) {
      chgStartDtIso3Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgStartDtIso3Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIso3Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso3Redefined.begin,chgStartDtIso3Redefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIso3Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIso3Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso3Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgStartDtIso3Redefined with another Field
	 *	@param value
	 */
   public void setChgStartDtIso3Redefined(Field source) {
   	replace(source,0,source.length(),chgStartDtIso3Redefined.begin,chgStartDtIso3Redefined.length());
   }  
   
     /**
	 * 	Update ChgStartDtIso3Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgStartDtIso3Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso3Redefined.begin,chgStartDtIso3Redefined.length());
   }
   
     /**
	 * 	Update ChgStartDtIso3Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgStartDtIso3Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgStartDtIso3Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgEndDtIso
	 *	@return chgEndDtIso
	 */
	public long getChgEndDtIso() throws CFException {
       if (isChgEndDtIsoModified()) { 
           chgEndDtIso = refreshChgEndDtIso();
        }
   		return chgEndDtIso;
	}
	

	
	   
	/**
	 * 	Update ChgEndDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DT-ISO
	 *	@param number
	 */
	public void setChgEndDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDtIso = checkChgEndDtIsoMaxLimit(number); 
		serializeChgEndDtIso(chgEndDtIso);
	}
	

	/**
	 * 	Update ChgEndDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIso(char[] value) throws CFException {
		 chgEndDtIso = serializeChgEndDtIso(value);
	}
	/**
	 * 	Update ChgEndDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIsoString(char[] value) throws CFException {
		 setChgEndDtIso(value);
	}
	/**
	 *	Returns the value of chgEndDtIsoRedefined
	 *	@return chgEndDtIsoRedefined
	 */   
	 public ChgEndDtIsoRedefined getChgEndDtIsoRedefined() {
   	return chgEndDtIsoRedefined;
   }
   /**
	* 	Update ChgEndDtIsoRedefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-END-DT-ISO-REDEFINED
	*	@param value
	*/
   public void setChgEndDtIsoRedefined(char[] value) {
      chgEndDtIsoRedefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgEndDtIsoRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIsoRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIsoRedefined.begin,chgEndDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIsoRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIsoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIsoRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgEndDtIsoRedefined with another Field
	 *	@param value
	 */
   public void setChgEndDtIsoRedefined(Field source) {
   	replace(source,0,source.length(),chgEndDtIsoRedefined.begin,chgEndDtIsoRedefined.length());
   }  
   
     /**
	 * 	Update ChgEndDtIsoRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIsoRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIsoRedefined.begin,chgEndDtIsoRedefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIsoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIsoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIsoRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgEndDtIso2
	 *	@return chgEndDtIso2
	 */
	public long getChgEndDtIso2() throws CFException {
       if (isChgEndDtIso2Modified()) { 
           chgEndDtIso2 = refreshChgEndDtIso2();
        }
   		return chgEndDtIso2;
	}
	

	
	   
	/**
	 * 	Update ChgEndDtIso2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DT-ISO-2
	 *	@param number
	 */
	public void setChgEndDtIso2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDtIso2 = checkChgEndDtIso2MaxLimit(number); 
		serializeChgEndDtIso2(chgEndDtIso2);
	}
	

	/**
	 * 	Update ChgEndDtIso2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIso2(char[] value) throws CFException {
		 chgEndDtIso2 = serializeChgEndDtIso2(value);
	}
	/**
	 * 	Update ChgEndDtIso2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIso2String(char[] value) throws CFException {
		 setChgEndDtIso2(value);
	}
	/**
	 *	Returns the value of chgEndDtIso2Redefined
	 *	@return chgEndDtIso2Redefined
	 */   
	 public ChgEndDtIso2Redefined getChgEndDtIso2Redefined() {
   	return chgEndDtIso2Redefined;
   }
   /**
	* 	Update ChgEndDtIso2Redefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-END-DT-ISO-2-REDEFINED
	*	@param value
	*/
   public void setChgEndDtIso2Redefined(char[] value) {
      chgEndDtIso2Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgEndDtIso2Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIso2Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso2Redefined.begin,chgEndDtIso2Redefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIso2Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIso2Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso2Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgEndDtIso2Redefined with another Field
	 *	@param value
	 */
   public void setChgEndDtIso2Redefined(Field source) {
   	replace(source,0,source.length(),chgEndDtIso2Redefined.begin,chgEndDtIso2Redefined.length());
   }  
   
     /**
	 * 	Update ChgEndDtIso2Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIso2Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso2Redefined.begin,chgEndDtIso2Redefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIso2Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIso2Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso2Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of chgEndDtIso3
	 *	@return chgEndDtIso3
	 */
	public long getChgEndDtIso3() throws CFException {
       if (isChgEndDtIso3Modified()) { 
           chgEndDtIso3 = refreshChgEndDtIso3();
        }
   		return chgEndDtIso3;
	}
	

	
	   
	/**
	 * 	Update ChgEndDtIso3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DT-ISO-3
	 *	@param number
	 */
	public void setChgEndDtIso3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDtIso3 = checkChgEndDtIso3MaxLimit(number); 
		serializeChgEndDtIso3(chgEndDtIso3);
	}
	

	/**
	 * 	Update ChgEndDtIso3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIso3(char[] value) throws CFException {
		 chgEndDtIso3 = serializeChgEndDtIso3(value);
	}
	/**
	 * 	Update ChgEndDtIso3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDtIso3String(char[] value) throws CFException {
		 setChgEndDtIso3(value);
	}
	/**
	 *	Returns the value of chgEndDtIso3Redefined
	 *	@return chgEndDtIso3Redefined
	 */   
	 public ChgEndDtIso3Redefined getChgEndDtIso3Redefined() {
   	return chgEndDtIso3Redefined;
   }
   /**
	* 	Update ChgEndDtIso3Redefined with the passed value
	*   Corresponding COBOL Variable is WS-CHG-END-DT-ISO-3-REDEFINED
	*	@param value
	*/
   public void setChgEndDtIso3Redefined(char[] value) {
      chgEndDtIso3Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ChgEndDtIso3Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIso3Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso3Redefined.begin,chgEndDtIso3Redefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIso3Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIso3Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso3Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ChgEndDtIso3Redefined with another Field
	 *	@param value
	 */
   public void setChgEndDtIso3Redefined(Field source) {
   	replace(source,0,source.length(),chgEndDtIso3Redefined.begin,chgEndDtIso3Redefined.length());
   }  
   
     /**
	 * 	Update ChgEndDtIso3Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setChgEndDtIso3Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso3Redefined.begin,chgEndDtIso3Redefined.length());
   }
   
     /**
	 * 	Update ChgEndDtIso3Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChgEndDtIso3Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,chgEndDtIso3Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cycChangeNo
	 *	@return cycChangeNo
	 */
   public char[] getCycChangeNo() throws CFException{
     if (isCycChangeNoModified()) { 
        cycChangeNo = refreshCycChangeNo();
     }
   		return cycChangeNo;
   }

  
	/**
	*  set variable cycChangeNo
	*  Corresponding COBOL Variable is WS-CYC-CHANGE-NO
	*  @param value
	**/
   public void setCycChangeNo(char[] value) {
      cycChangeNo = checkCycChangeNoConstraints(value);
      serializeCycChangeNo(cycChangeNo);
   } 

     /**
	 * 	Update CycChangeNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCycChangeNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCycChangeNo,cycChangeNo.length);
   	
   }
   
   public void setCycChangeNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCycChangeNo,cycChangeNo.length);
   	
   }
   
     /**
	 * 	Update CycChangeNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCycChangeNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycChangeNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CycChangeNo with another Field
	 *	@param value
	 */
   public void setCycChangeNo(Field source) {
       replace(source,0,source.length(),beginCycChangeNo,CYC_CHANGE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update CycChangeNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCycChangeNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCycChangeNo,CYC_CHANGE_NO_LEN);
   	
   }
   
     /**
	 * 	Update CycChangeNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCycChangeNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCycChangeNo+targetIndex,targetLen);
    
   }
	char[] noCycChanged88Value = "  ".toCharArray();
	/**
	 *	Test condition "  " for isNoCycChanged()
	 *	@return  Returns true if isNoCycChanged() is "  "
	 */
   public boolean isNoCycChanged() throws CFException {
      return (  compareChars( getCycChangeNo() , noCycChanged88Value)  == 0  );
   }


	/**
	*  set values "  "
	*/
   	public void setNoCycChangedTrue() {  			
    	setCycChangeNo( noCycChanged88Value);
   	}
	/**
	 *	Returns the value of cycChangeBp
	 *	@return cycChangeBp
	 */
	public int getCycChangeBp() throws CFException {
       if (isCycChangeBpModified()) { 
           cycChangeBp = refreshCycChangeBp();
        }
   		return cycChangeBp;
	}
	

	
	   
	/**
	 * 	Update CycChangeBp with the passed value
	 *  Corresponding COBOL Variable is WS-CYC-CHANGE-BP
	 *	@param number
	 */
	public void setCycChangeBp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cycChangeBp = checkCycChangeBpMaxLimit(number); 
		serializeCycChangeBp(cycChangeBp);
	}
	

	public void setCycChangeBp(long number) {
	    number = checkCycChangeBpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCycChangeBp((int)number);
	}
	
	/**
	 * 	Update CycChangeBp with the passed value
	 *	@param value (String or char[])
	 */
	public void setCycChangeBp(char[] value) throws CFException {
		 cycChangeBp = serializeCycChangeBp(value);
	}
	/**
	 * 	Update CycChangeBp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCycChangeBpString(char[] value) throws CFException {
		 setCycChangeBp(value);
	}
	
	/**
	 *	Test condition 2 for isCycChangeBp2()
	 *	@return  Returns true if isCycChangeBp2() is 2
	 */
   public boolean isCycChangeBp2() throws CFException {
      return (  getCycChangeBp()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setCycChangeBp2True() {  			
    	setCycChangeBp( 2);
   	}
	
	/**
	 *	Test condition 3 for isCycChangeBp3()
	 *	@return  Returns true if isCycChangeBp3() is 3
	 */
   public boolean isCycChangeBp3() throws CFException {
      return (  getCycChangeBp()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setCycChangeBp3True() {  			
    	setCycChangeBp( 3);
   	}
	/**
	 *	Returns the value of leapYear
	 *	@return leapYear
	 */
	public int getLeapYear() throws CFException {
       if (isLeapYearModified()) { 
           leapYear = refreshLeapYear();
        }
   		return leapYear;
	}
	

	
	   
	/**
	 * 	Update LeapYear with the passed value
	 *  Corresponding COBOL Variable is WS-LEAP-YEAR
	 *	@param number
	 */
	public void setLeapYear(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    leapYear = checkLeapYearMaxLimit(number); 
		serializeLeapYear(leapYear);
	}
	

	public void setLeapYear(long number) {
	    number = checkLeapYearMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLeapYear((int)number);
	}
	
	/**
	 * 	Update LeapYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setLeapYear(char[] value) throws CFException {
		 leapYear = serializeLeapYear(value);
	}
	/**
	 * 	Update LeapYear with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLeapYearString(char[] value) throws CFException {
		 setLeapYear(value);
	}
	/**
	 *	Returns the value of leapYearRemainder
	 *	@return leapYearRemainder
	 */
	public int getLeapYearRemainder() throws CFException {
       if (isLeapYearRemainderModified()) { 
           leapYearRemainder = refreshLeapYearRemainder();
        }
   		return leapYearRemainder;
	}
	

	
	   
	/**
	 * 	Update LeapYearRemainder with the passed value
	 *  Corresponding COBOL Variable is WS-LEAP-YEAR-REMAINDER
	 *	@param number
	 */
	public void setLeapYearRemainder(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    leapYearRemainder = checkLeapYearRemainderMaxLimit(number); 
		serializeLeapYearRemainder(leapYearRemainder);
	}
	

	public void setLeapYearRemainder(long number) {
	    number = checkLeapYearRemainderMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLeapYearRemainder((int)number);
	}
	
	/**
	 * 	Update LeapYearRemainder with the passed value
	 *	@param value (String or char[])
	 */
	public void setLeapYearRemainder(char[] value) throws CFException {
		 leapYearRemainder = serializeLeapYearRemainder(value);
	}
	/**
	 * 	Update LeapYearRemainder with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLeapYearRemainderString(char[] value) throws CFException {
		 setLeapYearRemainder(value);
	}
	
	/**
	 *	Test condition 0 for isLeapYear1()
	 *	@return  Returns true if isLeapYear1() is 0
	 */
   public boolean isLeapYear1() throws CFException {
      return (  getLeapYearRemainder()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setLeapYear1True() {  			
    	setLeapYearRemainder( 0);
   	}

	
	
	
	/**
	 * 	initializes CycleInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setJobIterNo(0);
         setBlTypCd(CONSTANTS.SPACE_2);
                     setCycNo(0);
         setCycAsofDt(CONSTANTS.SPACE_10);
         setCycStartDt(CONSTANTS.SPACE_10);
         setCycEndDt(CONSTANTS.SPACE_10);
                     setCycStartDtIso(0);
                     setCycEndDtIso(0);
         setCycMthYr(CONSTANTS.SPACE_6);
         setBlStreamCd(CONSTANTS.SPACE);
         setVisionInstanceCd(CONSTANTS.SPACE);
                     setChgBlEndIso(0);
                     setChgDtIso(0);
                     setChgStartDtIso(0);
                     setChgStartDtIso2(0);
                     setChgStartDtIso3(0);
                     setChgEndDtIso(0);
                     setChgEndDtIso2(0);
                     setChgEndDtIso3(0);
         setCycChangeNo(CONSTANTS.SPACE_2);
                     setCycChangeBp(0);
                     setLeapYear(0);
                     setLeapYearRemainder(0);
   }

		public static int getCycleInfoFieldLength() {
			return CYCLE_INFO_LENGTH;
		}

}
  
