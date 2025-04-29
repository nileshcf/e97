package com.cloudframe.app.special2.dto;

/**
*  The class RestoTablas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RestoTablas extends RestoTablasSerialized {
   

								@Getter @Setter private int tiNMax;
				@Getter @Setter private TiArbol tiArbol = new TiArbol();
	
	/**
	* Constructor for RestoTablas
	**/
    public RestoTablas() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTiArbol().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setTiNMax(50);
    }





}
  
