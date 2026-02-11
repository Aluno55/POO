# Sistema de Controle de Versão
## Configuração inicial para uso do Git
É necessario configurar o seu nome de usuário e e-mail para conectar na sua conta Git, permitindo você a fazer commit
- Configuração de nome de usuário e e-mail no Git
```bash
git config −−global user.name "Seu Nome Completo"
git config −−global user.email "seu−email@exemplo.com"
```

- Criando Personal Access Token (PAT) no GitHub

Um PAT é um token, uma senha exclusivamente sua que se perder, precisará gerar outra, garantindo um maior nivel de segurança para seus repositorios. Para criar um PAT:

1. Abra sua conta Git e vai em Settings;
2. Lá no fim da barra lateral derá Developer Settings;
3. Em Developer Settings, clica em Personal Access Tokens e vai em Tokens (classic);
4. Vai ter a opção de Generate New Token, escolha Generate New Token (classic).
5. Selecione os Scopes que deseja usar, o tempo de vida do PAT, se quiser pode colocar uma Note para lembrar para que usará o PAT.


- Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?