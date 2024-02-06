package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.enums.DirectionEnum;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:21-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class DirectionSIAMMapperImpl implements DirectionSIAMMapper {

    @Override
    public DirectionEnum asDirectionEnum(Direction direction) {
        if ( direction == null ) {
            return null;
        }

        DirectionEnum directionEnum;

        switch ( direction ) {
            case ASC: directionEnum = DirectionEnum.ASC;
            break;
            case DESC: directionEnum = DirectionEnum.DESC;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + direction );
        }

        return directionEnum;
    }

    @Override
    public Direction asDirection(DirectionEnum directionEnum) {
        if ( directionEnum == null ) {
            return null;
        }

        Direction direction;

        switch ( directionEnum ) {
            case ASC: direction = Direction.ASC;
            break;
            case DESC: direction = Direction.DESC;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + directionEnum );
        }

        return direction;
    }
}
