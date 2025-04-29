package com.cloudframe.app.mcsort05.file.records;

/**
*  The class Ip40005GroupStatusRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip40005GroupStatusRec extends Ip40005GroupStatusRecSerialized {
   

								@Getter @Setter private int ip40005GrpFileSeqNbr;

								@Getter @Setter private long ip40005GroupSeqNum;
	
	/**
	* Constructor for Ip40005GroupStatusRec
	**/
    public Ip40005GroupStatusRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
