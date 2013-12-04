package pl.lrozek.spring.qualifier.service;

public class ServiceImpl implements Service {

    public ServiceImpl( Long value ) {
        this.value = value;
    }

    @Override
    public Long getValue() {
        return value;
    }

    private Long value;

}
