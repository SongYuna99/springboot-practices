springboot-practices
	├ springboot-ex
	├ springboot-helloworld
	├ springboot-myapplication
	├ springbott-myweb
	└ pom.xml (x)

< CMD에서 git 연동 >
	cd 로컬파일경로
	>> git init 							: .git 만들어짐(=share project)
	>> git add -A 							: 모든 파일 추가
	>> git commit -m "[commit message]"		: 커밋
	>> git branch -M [branch_name]			: 브랜치 생성
	>> git remote add origin [URL] 			: 원격 저장소 연결
	>> git push -u origin [branch_name]		: 푸시

< commit & push >
	>> git add -A
	>> git commit -m "[commit message]"
	>> git push