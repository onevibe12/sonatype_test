# CI/CD Test

Tags 전략 tag 를 달아야지만 CI/CD 동작
excuter : kubernetes

# 1. runner.values.yaml 편집후 배포할경우
아래 명령으로 runner 설치후 CI/CD 진행 
```
# helm repo add gitlab https://charts.gitlab.io
# helm repo update
# kubectl create namespace gitlab-managed-apps
# helm install --namespace gitlab-managed-apps gitlab-runner -f runner-values.yaml gitlab/gitlab-runner 
```
## 1-1. runner pod 작업간 해당 파드 hosts파일을 수정해야할경우 수정
[[runners.kubernetes.host_aliases]]
ip=x.x.x.x
hostnames = ["harbor.or.kr"]


# 2. .gitlab-ci.yml

아래 gitlab-ci.yml 에서 변수 설정 및 각 스테이징에 개인정보가 될수 있는 부분들 수정후 사용
```
harbor login -u -p -> user, password 수정
```


.
	

