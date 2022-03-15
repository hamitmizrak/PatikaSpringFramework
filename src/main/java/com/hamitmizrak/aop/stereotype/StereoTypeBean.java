package com.hamitmizrak.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="Merhabalar";
    private String trade;
}
