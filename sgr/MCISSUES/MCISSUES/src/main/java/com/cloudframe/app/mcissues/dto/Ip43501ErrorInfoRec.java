package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501ErrorInfoRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip43501ErrorInfoRec extends Ip43501ErrorInfoRecSerialized {
   
				@Getter @Setter private Ip43501SortSolution ip43501SortSolution = new Ip43501SortSolution();
				@Getter @Setter private Ip43501FileStatusRec ip43501FileStatusRec = new Ip43501FileStatusRec();
	
	/**
	* Constructor for Ip43501ErrorInfoRec
	**/
    public Ip43501ErrorInfoRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp43501SortSolution().setParent(this,getStartOffset() + 0);
					getIp43501FileStatusRec().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip43501ErrorInfoRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp43501SortSolution().initialize();
     
   }


}
  
