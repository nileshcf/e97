package com.cloudframe.app.init1.dto;

/**
*  The class NoFiller is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class NoFiller extends NoFillerSerialized {
   
				@Getter @Setter private BiypInit biypInit = new BiypInit();

								@Getter @Setter private int fillerd;
				@Getter @Setter private BiypCurr biypCurr = new BiypCurr();

						@Getter @Setter private char[] wsbiypAddedSw = new char[1];

								@Getter @Setter private int biypPriorCnt;
	
	/**
	* Constructor for NoFiller
	**/
    public NoFiller() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBiypInit().setParent(this,getStartOffset() + 0);
					getBiypCurr().setParent(this,getStartOffset() + 59);
	   	/*  end of offset */
								setFillerd(0);
								setWsbiypAddedSw(("N").toCharArray());
								setBiypPriorCnt(0);
    }





}
  
