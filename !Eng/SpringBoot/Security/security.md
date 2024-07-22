## Security

Spring Security — это мощный и настраиваемый фреймворк, используемый для обеспечения безопасности на уровне приложений. Он предоставляет всеобъемлющие решения для аутентификации, авторизации, защиты от угроз, управления сессиями и интеграции с другими популярными библиотеками и фреймворками.

Основные компоненты Spring Security
### Аутентификация (Authentication):

Аутентификация — это процесс проверки подлинности пользователя. В Spring Security это достигается через реализацию интерфейса AuthenticationProvider, который проверяет учетные данные пользователя.
Существуют различные методы аутентификации, такие как форма логина, базовая аутентификация, OAuth2, JWT и т.д.
### Авторизация (Authorization):

Авторизация отвечает за контроль доступа к ресурсам в приложении после успешной аутентификации пользователя.
Spring Security использует выражения авторизации (например, @PreAuthorize, @Secured) для определения правил доступа к методам или URL.
### Фильтры (Filters):

Spring Security использует цепочку фильтров для обработки запросов и ответов. Основной класс — DelegatingFilterProxy, который перенаправляет запросы к цепочке фильтров безопасности.
Фильтры включают в себя аутентификацию, управление сессиями, защиту от CSRF и многое другое.
### Защита от угроз:

Включает в себя защиту от таких атак, как CSRF (Cross-Site Request Forgery), XSS (Cross-Site Scripting) и защита от подбора паролей.
CSRF защита включена по умолчанию в Spring Security.
### Управление сессиями:

Spring Security позволяет управлять сессиями пользователей, предотвращать сессии с захватом контроля и настраивать политику обработки сессий.
Это включает такие функции, как максимальное количество сессий на одного пользователя, "конкурирующие" сессии и т.д.
### Интеграция с другими библиотеками и фреймворками:

Легко интегрируется с Spring MVC, Spring Boot и другими компонентами Spring.
Поддержка OAuth2, JWT, LDAP и других протоколов аутентификации и авторизации.

## Основные классы и интерфейсы
### SecurityContext:

Хранит данные о текущем пользователе, включая его учетные данные, роли и права доступа.
Класс SecurityContextHolder используется для доступа к текущему SecurityContext.
### UserDetailsService:

Интерфейс, который загружает данные пользователя по его имени пользователя.
Реализуется для интеграции с собственными системами управления пользователями.
### AuthenticationProvider:

Интерфейс для выполнения аутентификации.
Можно реализовать собственный провайдер аутентификации или использовать существующие, такие как DaoAuthenticationProvider.
### GrantedAuthority:

Интерфейс для предоставления прав доступа (ролей) пользователя.
SimpleGrantedAuthority — простая реализация этого интерфейса.
### SecurityConfigurerAdapter:

Абстрактный класс, который используется для настройки компонентов Spring Security.
Обычно расширяется классом WebSecurityConfigurerAdapter для настройки безопасности веб-приложений.
Пример конфигурации Spring Security

``` java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password(passwordEncoder().encode("password"))
            .roles("USER")
            .and()
            .withUser("admin")
            .password(passwordEncoder().encode("admin"))
            .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            .antMatchers("/", "/home").permitAll()
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

### Основные функции:
Аутентификация пользователей в памяти: В этом примере используются пользователи, хранящиеся в памяти.
Авторизация на основе ролей: URL /admin/** доступен только для пользователей с ролью ADMIN, /user/** — для пользователей с ролями USER или ADMIN.
Настройка формы входа: Определяется страница логина /login.
Шифрование паролей: Используется BCryptPasswordEncoder для шифрования паролей.