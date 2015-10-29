package pl.java.scalatech.conditional;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

class AvailableOnClasspathCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(AvailableOnClasspath.class.getName());
        String className = String.valueOf(attributes.get("value"));
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException ignored) {
        }
        return false;
    }

}