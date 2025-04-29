package com.cloudframe.app.o529351u.dto;

/**
*  The class CsvcCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CsvcCodeGroup extends CsvcCodeGroupSerialized {
   
					@Getter @Setter private CsvcCode csvcCode = new CsvcCode();
					@Getter @Setter private CsvcCodeA csvcCodeA = new CsvcCodeA();
	
	/**
	* Constructor for CsvcCodeGroup
	**/
    public CsvcCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCsvcCode().setParent(this,getStartOffset() + 0);
					getCsvcCodeA().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
